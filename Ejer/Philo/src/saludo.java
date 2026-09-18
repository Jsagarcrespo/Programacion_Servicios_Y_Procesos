public class saludo implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Saludo numnero:  " + i);

        }
    }
}
