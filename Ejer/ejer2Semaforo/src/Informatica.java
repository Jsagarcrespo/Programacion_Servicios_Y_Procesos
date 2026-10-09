import java.util.concurrent.Semaphore;

public class Informatica {

    private int totalPortatiles;
    private Semaphore portatiles;

    public Informatica(int totalPortatiles) {
        this.totalPortatiles = totalPortatiles;
        this.portatiles = new Semaphore(totalPortatiles);
    }

    class Estudiante implements Runnable {

        private int id;

        public Estudiante(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            boolean adquirido = false;

            try {
                portatiles.acquire();
                adquirido = true;

                System.out.println("El estudiante " + id
                        + " esta usando un portatil.");

                Thread.sleep(2000);

                System.out.println("El estudiante " + id
                        + " ha terminado de usar el portatil.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                if (adquirido) {
                    portatiles.release();
                }
            }
        }
    }

    public static void main(String[] args) {

        Informatica aula = new Informatica(3);

        for (int i = 1; i <= 5; i++) {
            new Thread(aula.new Estudiante(i)).start();
        }
    }
}