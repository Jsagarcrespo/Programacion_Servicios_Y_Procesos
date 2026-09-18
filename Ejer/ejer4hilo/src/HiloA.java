
public class HiloA implements Runnable {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();

        System.out.println("Comienza " + hiloActual.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " * 5 = " + i* 5);
        }

    }
}

