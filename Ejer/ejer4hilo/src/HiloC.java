import java.util.ArrayList;

public class HiloC implements Runnable {

    @Override
    public void run() {

        Thread hiloActual = Thread.currentThread();

        System.out.println("Comienza " + hiloActual.getName());

        ArrayList<String> ciudades = new ArrayList<>();

        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Bilbao");
        ciudades.add("Valencia");
        ciudades.add("Sevilla");

        for (String ciudad : ciudades) {
            System.out.println("Ciudad: " + ciudad);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Termina " + hiloActual.getName());
    }
}
