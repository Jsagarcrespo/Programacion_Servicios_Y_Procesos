import java.util.concurrent.Semaphore;

public class Parking {



    private int vehiculosMaximos;
    private int vehiculoDentro;

    private int pesoActual;
    private int maxPeso = 100000;


    private Semaphore semaphore = new Semaphore(20);

    public Parking(int vehiculosMaximos) {
        this.vehiculosMaximos = vehiculosMaximos;
    }

    public void entrar(int id, int peso) throws InterruptedException{

        while(true) {
            semaphore.acquire();

            if (vehiculoDentro < vehiculosMaximos && pesoActual + peso <= maxPeso) {
                vehiculoDentro++;
                pesoActual += peso;

                System.out.println("Vehiculo " + id + " y peso " + peso + "ahora hay: " + vehiculoDentro);
                semaphore.release();
                return;
            }

            semaphore.release();
            Thread.sleep(1000);
        }
    }

    public void salir(int id, int peso) throws InterruptedException{

        semaphore.acquire();

        vehiculoDentro--;
        pesoActual -= peso;

        System.out.println();
        System.out.println("Vehiculo " + id + " ha salido y con peso " + peso + "ahora hay: " + vehiculoDentro);
        semaphore.release();

    }

}

