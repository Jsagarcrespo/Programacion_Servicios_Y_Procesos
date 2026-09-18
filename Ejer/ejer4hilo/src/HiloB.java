public class HiloB implements Runnable {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();

        System.out.println("Comienza " + hiloActual.getName());

        int suma = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0){
                suma += i;
            }
        }
    }
}


