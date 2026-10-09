import java.util.concurrent.Semaphore;

public class Biblioteca {

    private static final Semaphore semaforo = new Semaphore(1);

    static class Estudiante implements Runnable {

        private int id;

        public Estudiante(int id) {
            this.id = id;
        }

        @Override
        public void run() {

            try {
                semaforo.acquire();

                System.out.println("El estudiante " + id + " esta usando la impresora.");

                Thread.sleep(2000);

                System.out.println("El estudiante " + id + " ha terminado de imprimir.");

                semaforo.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            new Thread(new Estudiante(i)).start();
        }
    }

}
