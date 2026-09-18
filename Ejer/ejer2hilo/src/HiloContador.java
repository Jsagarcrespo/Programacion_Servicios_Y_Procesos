public class HiloContador extends Thread{

    @Override
    public void run() {
        System.out.println("lanzamos hilo de contador");

        for (int i = 1; i <= 50; i++) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
/*
public class HiloContador implements Runnable{

    @Override
    public void run() {
        System.out.println("lanzamos hilo de contador");

        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + i);



            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}*/
