import java.util.concurrent.Semaphore;

public class Ascensor {

    private int capacidadMaxima;
    private int pasajerosDentro = 0;

    private Semaphore mutex = new Semaphore(1);

    public Ascensor(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void entrar(int id) throws InterruptedException {
        while (true) {
            mutex.acquire();

            if (pasajerosDentro < capacidadMaxima) {
                pasajerosDentro++;

                System.out.println("Pasajero " + id
                        + " entra. Dentro: " + pasajerosDentro);

                mutex.release();
                return;
            }

            mutex.release();
            Thread.sleep(100);
        }
    }

    public void salir(int id) throws InterruptedException {
        mutex.acquire();

        pasajerosDentro--;

        System.out.println("Pasajero " + id
                + " sale. Dentro: " + pasajerosDentro);

        mutex.release();
    }
}