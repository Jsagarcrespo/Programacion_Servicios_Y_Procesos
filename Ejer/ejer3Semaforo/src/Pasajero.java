public class Pasajero implements Runnable {

    private int id;
    private Ascensor ascensor;

    public Pasajero(int id, Ascensor ascensor) {
        this.id = id;
        this.ascensor = ascensor;
    }

    @Override
    public void run() {
        try {
            ascensor.entrar(id);

            Thread.sleep(2000);

            ascensor.salir(id);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}