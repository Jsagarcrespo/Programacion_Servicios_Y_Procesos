public class HiloCarga extends Thread{
    public HiloCarga(Inventario inventario, String nombre) {
        super(nombre);
        this.inventario = inventario;
    }

    private Inventario inventario;

    @Override
    public void run(){
        System.out.println("comineza " + getName());

        for (int i = 0; i < 500; i++) {
            inventario.cargar(10, getName());
        }

        System.out.println("Termina " + getName());

    }





}
