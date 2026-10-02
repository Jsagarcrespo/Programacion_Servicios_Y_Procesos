public class Puente {

    private int pesoTotal = 0;
    private int vehDentro = 0;

    private final int pesoMax = 15000;
    private final int vehMax = 5;

    public synchronized void entrar(int peso, int id){

        while(pesoTotal + peso > pesoMax || vehDentro >= vehMax){
            System.out.println("el vehiculo " + id + "no puede entrar");
            System.out.println("Peso actual del puente: " + pesoTotal + "kg");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            pesoTotal = pesoTotal + peso;


        }

    }

}
