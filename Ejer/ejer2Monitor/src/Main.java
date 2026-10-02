void main() throws InterruptedException {

    Cuenta cuenta = new Cuenta();

    int numeroHilos = 5;

    Thread[] ahorradores = new Thread[numeroHilos];
    Thread[] gastadores = new Thread[numeroHilos];

    for (int i = 0; i < numeroHilos; i++) {

        ahorradores[i] = new Thread(
                new Ahorrador(i + 1, cuenta)
        );

        gastadores[i] = new Thread(
                new Gastador(i + 1, cuenta)
        );

        ahorradores[i].start();
        gastadores[i].start();
    }


    try {

        for (int i = 0; i < numeroHilos; i++) {

            ahorradores[i].join();
            gastadores[i].join();

        }

    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    System.out.println(
            "Saldo final: " + cuenta.getSaldo() + "€"
    );
}


