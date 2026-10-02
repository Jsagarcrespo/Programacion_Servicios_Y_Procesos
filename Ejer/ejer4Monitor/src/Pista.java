public class Pista {

    private boolean disponible = true;
    private boolean limpiando = false;

    public synchronized void jugar(int idUsuario) {

        while (!disponible || limpiando) {

            try {
                System.out.println("Usuario " + idUsuario +
                        " esta esperando porque la pista no esta disponible");

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        disponible = false;

        System.out.println("Usuario " + idUsuario + " esta jugando");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Usuario " + idUsuario + " ha terminado de jugar");

        limpiando = true;

        notifyAll();
    }

    public synchronized void limpiar() {

        while (!limpiando) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Se esta limpiando la pista");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        limpiando = false;
        disponible = true;

        System.out.println("La pista esta limpia y disponible");

        notifyAll();
    }
}
