public class Main {
    public static void main(String[] args) throws InterruptedException {

        Puente puente = new Puente();

        for (int i = 1; i <= 15; i++) {

            int peso = 1000 + (int) (Math.random() * 4000);

            Vehiculo v = new Vehiculo(i, peso, puente);
            v.start();
        }
    }
}


