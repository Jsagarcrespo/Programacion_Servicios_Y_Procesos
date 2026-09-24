public class Atleta extends Thread {

    public Atleta(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private int distancia = 0;

    @Override
    public void run(){

        while (distancia < 50){
            distancia += 5;

            System.out.println(nombre + " Ha recorrido " + distancia );

            try {
                int descanso = (int) (Math.random() * 400) + 100;
                Thread.sleep(descanso);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(nombre + " ha terminado!");
        }

    }


}
