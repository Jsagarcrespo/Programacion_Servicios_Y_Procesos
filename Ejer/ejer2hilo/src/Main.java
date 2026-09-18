//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {

    HiloContador contador = new HiloContador();
    HiloMinusculas minus = new HiloMinusculas();
    HiloMayusculas mayus = new HiloMayusculas();

    contador.setName("CONTADOR");
    minus.setName("MINUS");
    mayus.setName("MAYUS");

    contador.start();
    minus.start();
    mayus.start();

    System.out.println("Estado contador: " + contador.getState());
    System.out.println("Estado minusculas: " + minus.getState());
    System.out.println("Estado mayusculas: " + mayus.getState());


    try {
        contador.join();
        minus.join();
        mayus.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("Se ha terminado el hilo principal");


}
