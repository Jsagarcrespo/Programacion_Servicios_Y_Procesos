public class Cliente extends Thread{

    private Restaurante restaurante;

    private String nombre;

    public Cliente(Restaurante restaurante, String nombre) {
        super(nombre);
        this.restaurante = restaurante;

    }

    @Override
    public void run(){
        try {
            restaurante.entrar();

            int tiempo = (int)(Math.random() * 5000) + 1000;

            System.out.println(
                    getName() + " está comiendo durante " + tiempo +  "ms"
            );

            Thread.sleep(tiempo);

            restaurante.salir();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    // PARTE CON RUNNABLE

   /* private int idCliente;
    private Restaurante restaurante;

    public Cliente(int idCliente, Restaurante restaurante) {
        this.idCliente = idCliente;
        this.restaurante = restaurante;
    }

    @Override
    public void run() {

        restaurante.entrarProfe(idCliente);

        try {
            int tiempoComiendo = (int) (Math.random() * 5000) + 1000;

            System.out.println(
                    "cliente " + idCliente +
                            " está comiendo durante " + tiempoComiendo + " ms"
            );

            Thread.sleep(tiempoComiendo);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restaurante.salirPro(idCliente);
    }*/




}
