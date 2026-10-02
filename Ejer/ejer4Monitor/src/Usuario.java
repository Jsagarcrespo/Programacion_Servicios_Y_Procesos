public class Usuario implements Runnable{

    private int id;
    private Pista pista;

    public Usuario(int id, Pista pista){
        this.id = id;
        this.pista = pista;

    }

    @Override
    public void run(){
        pista.jugar(id);
    }

}
