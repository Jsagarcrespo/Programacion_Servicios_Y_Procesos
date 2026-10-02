public class Inventario extends Thread{

    public Inventario(int inventario) {
        this.inventario = inventario;
    }

    private int inventario;

    public synchronized void cargar(int cantidad, String nombreHilo){

        inventario += cantidad;

        System.out.println(nombreHilo + " carga " + cantidad+ " unidades" +
                "Inventario: " + inventario);
    }

    public synchronized void empaquetar(int cantidad, String nombreHilo){
        inventario -= cantidad;

        System.out.println(nombreHilo + " empaqueta " + cantidad + " unidades " +
                "Inventario: " + inventario);
    }

    public synchronized int getInventario(){
        return inventario;
    }

}
