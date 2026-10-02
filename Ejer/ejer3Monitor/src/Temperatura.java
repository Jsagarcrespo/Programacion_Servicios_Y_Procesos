public class Temperatura implements Runnable{

    private Sala sala;

    public Temperatura(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run(){
        int[] temperaturas = {25, 28, 32,35,29,27};

        for (int i = 0; i < temperaturas.length; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            sala.cambiarTemperatura(temperaturas[i]);

        }
    }

}
