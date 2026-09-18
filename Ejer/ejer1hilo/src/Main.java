import jdk.swing.interop.SwingInterOpUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {

    System.out.println("cominenza el hilo Principal");

    HiloSaludador hiloSaludo = new HiloSaludador();
    HiloContador hiloContar = new HiloContador();

    hiloSaludo.start();
    hiloContar.start();

  /*  hiloContar.getPriority();
    hiloSaludo.getName();*/

    try {
        hiloSaludo.join();

        hiloContar.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }


    System.out.println("Termina el hilo");

//    s.run();   // Seria un fallo llamar a esto  y no hacer lo de arriba


    ///////// CON RUNABLE ///////////
    Runnable sal = new HiloSaludador();
    Runnable cont = new HiloContador();


    Thread saludador = new Thread(sal, "HiloSaludador");
    Thread contador = new Thread(sal, "HiloContador");

    saludador.start();
    contador.start();

    Thread.sleep(400);
    try {
        saludador.join();

        contador.join();
    } catch (InterruptedException e) {
        System.out.println("Hilo principal finalizado");
    }



}
