//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() throws InterruptedException {

    HiloContadorPar contadorPar = new HiloContadorPar();
    HiloContadorImpar contadorImpar = new HiloContadorImpar();

    Thread hiloPar = new Thread(contadorPar);
    Thread hiloImpar = new Thread(contadorImpar);

    hiloPar.setName("CONTADOR_PAR");
    hiloImpar.setName("CONTADOR_IMPAR");

    System.out.println("Prioridad inicial hilo par: " + hiloPar.getPriority());
    System.out.println("Prioridad inicial hilo impar: " + hiloImpar.getPriority());

    hiloPar.setPriority(1);
    hiloImpar.setPriority(3);

    System.out.println("Nueva prioridad hilo par: " + hiloPar.getPriority());
    System.out.println("Nueva prioridad hilo impar: " + hiloImpar.getPriority());

    hiloPar.start();
    hiloImpar.start();

    hiloPar.join();
    hiloImpar.join();

    System.out.println("Se ha terminado el hilo principal");
}


/*void main() throws InterruptedException {

    HiloContadorPar contadorPar = new HiloContadorPar();
    HiloContadorImpar contadorImpar = new HiloContadorImpar();


    contadorPar.setName("CONTADOR");
    contadorImpar.setName("contadorImpar");


    contadorPar.start();
    contadorImpar.start();


    System.out.println("Estado contador: " + contadorPar.getState());
    System.out.println("Estado contadorImparculas: " + contadorImpar.getState());

    contadorImpar.getPriority();
    contadorPar.getPriority();

    try {
        contadorPar.join();
        contadorImpar.join();

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("Se ha terminado el hilo principal");


}*/
