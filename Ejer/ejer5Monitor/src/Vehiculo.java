public class Vehiculo extends Thread {

    private int id;
    private int peso;
    private Puente puente;

    public Vehiculo(int id, int peso, Puente puente) {
        this.id = id;
        this.peso = peso;
        this.puente = puente;
    }

    @Override
    public void run() {

        puente.entrar(peso, id);

        try {
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        puente.salirPuente(peso, id);
    }
}

