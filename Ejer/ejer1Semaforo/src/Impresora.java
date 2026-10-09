import java.util.concurrent.Semaphore;

public class Impresora {

    private  static Semaphore semaforo = new Semaphore(1);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Estudiante(i), "Estudiante-" + i).start();
        }
    }

    static class Estudiante implements Runnable{

        public Estudiante(int id) {
            this.id = id;
        }

        private int id;

        public void run() {
            try {
                semaforo.acquire();

                System.out.println("Esdudiante " + id + "esta imprimiendo");

                Thread.sleep(2000);

                System.out.println("Estudiante " + id + " ha terminado");

                semaforo.release();



            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}



