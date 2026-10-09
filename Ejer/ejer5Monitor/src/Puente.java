public class Puente {

    private int pesoTotal = 0;
    private int vehDentro = 0;

    private final int pesoMax = 15000;
    private final int vehMax = 5;

    public synchronized void entrar(int peso, int id) {

        while (pesoTotal + peso > pesoMax || vehDentro >= vehMax) {

            System.out.println("El vehículo " + id + " no puede entrar.");
            System.out.println("Peso actual del puente: " + pesoTotal + " kg");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        pesoTotal += peso;
        vehDentro++;

        System.out.println("El vehículo " + id + " ha entrado.");
        System.out.println("Peso actual: " + pesoTotal + " kg");
        System.out.println("Vehículos dentro: " + vehDentro);
    }

    public synchronized void salirPuente(int peso, int id) {

        pesoTotal -= peso;
        vehDentro--;

        System.out.println("El vehículo " + id + " ha salido.");
        System.out.println("Peso actual: " + pesoTotal + " kg");
        System.out.println("Vehículos dentro: " + vehDentro);


        notifyAll();
    }
}