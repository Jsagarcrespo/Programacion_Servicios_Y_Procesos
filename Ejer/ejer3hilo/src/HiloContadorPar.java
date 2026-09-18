public class HiloContadorPar implements Runnable {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();

        System.out.println("Comienza: " + hiloActual.getName());
        System.out.println("Estado: " + hiloActual.getState());
        System.out.println("Prioridad: " + hiloActual.getPriority());

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(
                        hiloActual.getName() + " -> " + i +
                                " | Estado: " + hiloActual.getState()
                );
            }

           /* try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }

        System.out.println("Termina: " + hiloActual.getName());
        System.out.println("Estado final: " + hiloActual.getState());
    }
}



/*
public class HiloContadorPar extends Thread{

    @Override
    public void run() {
        System.out.println("lanzamos hilo de contador");

        for (int i = 1; i <= 50; i++) {

            if ( i % 2 == 0 ){
                System.out.println(i);
            }


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
*/

