void main() throws InterruptedException {

    Inventario inventario = new Inventario(100);

    Thread[] hilos = new Thread[16];

    for (int i = 0; i < 8; i++) {
        hilos[i] = new HiloCarga(inventario, "Carga-" + (i + 1));
    }

    for (int i = 0; i < 8; i++) {
        hilos[i + 8] = new HiloEmpaquetado(
                inventario,
                "Empaquetado-" + (i + 1)
        );
    }

    for (Thread hilo : hilos) {
        hilo.start();
    }

    for (Thread hilo : hilos) {
        try {
            hilo.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal ha sido interrumpido.");
        }
    }


    System.out.println("Inventario final: " + inventario.getInventario());


}
