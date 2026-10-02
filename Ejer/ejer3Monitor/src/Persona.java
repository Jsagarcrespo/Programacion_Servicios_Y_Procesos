public class Persona implements Runnable{

    private int id;
    private Sala sala;

    public Persona(int id, Sala sala) {
        this.id = id;
        this.sala = sala;
    }

    @Override
    public void run(){

        sala.entrar(id);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sala.salir(id);

    }


}
