public class Hilo extends Thread{

    private Contador contador;
    private int hiloIndepe = 0;

    public Hilo(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5000; i++) {
            contador.incrementar();
            hiloIndepe++;
        }

        System.out.println(
                getName() + " ha hecho " + hiloIndepe + " incrementos"
        );

    }
}
