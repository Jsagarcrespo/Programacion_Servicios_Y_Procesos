public class Hiloletra extends Thread{

    @Override
    public void run() {
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.println(letra);
        }
    }

}
