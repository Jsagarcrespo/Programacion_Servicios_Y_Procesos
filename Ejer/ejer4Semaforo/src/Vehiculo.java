import javax.swing.text.html.parser.Parser;

public class Vehiculo implements Runnable{


    private int id;
    private int peso;

    private Parking parking;

    public Vehiculo(int id, int peso, Parking parking) {
        this.id = id;
        this.peso = peso;
        this.parking = parking;
    }

    @Override
    public void run(){

        try {
            parking.entrar(id, peso);

            Thread.sleep(2000);

            parking.salir(id, peso);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
