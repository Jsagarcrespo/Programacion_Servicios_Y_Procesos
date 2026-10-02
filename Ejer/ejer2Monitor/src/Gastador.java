public class Gastador implements Runnable{
    private int id;
    private Cuenta cuenta;

    public Gastador(int id, Cuenta cuenta) {
        this.id = id;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            cuenta.gastar(id);

        }
    }
}
