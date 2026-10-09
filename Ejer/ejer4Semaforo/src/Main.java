public class Main {

    public static void main(String[] args) {

        Parking parking = new Parking(20);

        for (int i = 1; i <= 20; i++) {

            int peso = 3000 + (i * 100);

            Vehiculo vehiculo = new Vehiculo(i, peso, parking);

            new Thread(vehiculo).start();
        }
    }
}