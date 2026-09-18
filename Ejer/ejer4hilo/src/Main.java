void main() throws InterruptedException {

    System.out.println("=== COMIENZA EL HILO PRINCIPAL ===");

    HiloA tareaA = new HiloA();
    HiloB tareaB = new HiloB();
    HiloC tareaC = new HiloC();

    Thread hiloA = new Thread(tareaA);
    Thread hiloB = new Thread(tareaB);
    Thread hiloC = new Thread(tareaC);

    hiloA.setName("HiloA");
    hiloB.setName("HiloB");
    hiloC.setName("HiloC");


    hiloA.start();
    hiloA.join();
    // ponemos el join para que no se ejecute el resto de los hilos

    hiloB.start();
    hiloB.join();

    hiloC.start();
    hiloC.join();

    System.out.println("=== TERMINA EL HILO PRINCIPAL ===");
}
