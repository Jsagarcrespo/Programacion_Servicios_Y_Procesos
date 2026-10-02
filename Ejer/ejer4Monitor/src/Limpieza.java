public class Limpieza implements Runnable {

    private Pista pista;

    public Limpieza(Pista pista) {
        this.pista = pista;
    }

    @Override
    public void run() {

        while (true) {
            pista.limpiar();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
