public class Cuenta {

    public int getSaldo() {
        return saldo;
    }

    private int saldo = 0;

    public synchronized void ahorrar(int idAhorrardor) {

        while (saldo >= 250) {
            try {
                System.out.println(
                        "Ahorrador " + idAhorrardor +
                                " espera porque el saldo es " + saldo + "€"
                );

                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            saldo += 10;

            System.out.println(
                    "Ahorrador " + idAhorrardor +
                            " ha ahorrado 10€. Saldo: " + saldo + "€"
            );

            notifyAll();

        }


    }

    public synchronized void gastar(int idGastador) {

        while (saldo < 10) {
            try {
                System.out.println(
                        "Gastador " + idGastador +
                                " espera porque el saldo es " + saldo + "€"
                );

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        saldo -= 10;

        System.out.println(
                "Gastador " + idGastador +
                        " ha gastado 10€. Saldo: " + saldo + "€"
        );

        notifyAll();
    }

}
