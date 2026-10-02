public class HiloEmpaquetado extends Thread{

    public HiloEmpaquetado(Inventario inventario, String nombre) {
        super(nombre);
        this.inventario = inventario;
    }

    private Inventario inventario;

    @Override
    public void run(){

        for (int i = 0; i < 500; i++) {
            inventario.empaquetar(10, getName());
        }

        System.out.println("Termina" + getName());

    }




}
