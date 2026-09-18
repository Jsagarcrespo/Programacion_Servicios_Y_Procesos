public class HiloSaludador extends Thread {
    @Override
    public void run(){
        System.out.println("lanzamos hilo de saludo");
        for (int i = 0; i < 20; i++) {
            System.out.println("Hola desde el hilo saludador");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }

}
