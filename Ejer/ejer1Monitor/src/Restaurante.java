public class Restaurante {

    private int mesasDisponibles = 5;

    public synchronized void entrar() throws  InterruptedException{

        while (mesasDisponibles == 0){
            wait();
        }

        mesasDisponibles--;

        System.out.println(
                Thread.currentThread().getName() +
                        "ha ocupado una. Mesas disponibles: " +
                        mesasDisponibles
        );
    }

        public synchronized void salir(){

            mesasDisponibles++;
            System.out.println(
                    Thread.currentThread().getName() +
                            "ha ocupado una. Mesas disponibles: " +
                            mesasDisponibles
            );

            notify();

        }



        /////////////


        public synchronized void entrarProfe(int idCliente){

            while (mesasDisponibles == 0){
                try {
                    System.out.println("cliente" + idCliente + "espera por una mesa");
                    wait(); // espera que haya mesas disponibles
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            mesasDisponibles--;

            System.out.println(
                    "cliente " +  idCliente + " se ha sentado. Mesas disponible: " + mesasDisponibles
            );
        }


    public synchronized void salirPro(int idCliente){

        mesasDisponibles++;
        System.out.println("cliente" + idCliente + "se ha ido. mesas disponible:" + mesasDisponibles);

        notifyAll();

    }


}
