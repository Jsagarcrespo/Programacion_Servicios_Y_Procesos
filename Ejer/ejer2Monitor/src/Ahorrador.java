public class Ahorrador implements Runnable {

    private int id;
    private Cuenta cuenta;

    public Ahorrador(int id, Cuenta cuenta) {
        this.id = id;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            cuenta.ahorrar(id);

        }
    }

}
