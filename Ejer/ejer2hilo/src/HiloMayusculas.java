public class HiloMayusculas extends Thread {

    @Override
    public void run() {
        System.out.println("comenzamos los caracteres en mayusculas");
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            System.out.println(letra);
        }
    }

}
