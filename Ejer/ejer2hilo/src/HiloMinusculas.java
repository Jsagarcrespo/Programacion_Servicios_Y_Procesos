public class HiloMinusculas extends Thread {
    @Override
    public void run(){
        System.out.println("lanzamos hilo de caracteres en minuscula");
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.println(letra);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }

}

/*
public class HiloMinusculas implements Runnable {
    @Override
    public void run(){
        System.out.println("lanzamos hilo de caracteres en minuscula");

        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.println(Thread.currentThread().getName()) ;
            System.out.println(Thread.currentThread().getState() + "estado interno");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }

}*/
