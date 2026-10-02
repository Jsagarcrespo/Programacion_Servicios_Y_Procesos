public class CuentaBancaria extends Thread {

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }


    private double saldo;

    public synchronized void ingresar(double cantidad, String nombreHilo){
        saldo += cantidad;

        System.out.println(nombreHilo + " ingresa " + cantidad + "€" +
                "Su saldo: " + saldo + "€");
    }

    public synchronized void retirar(double cantidad, String nombreHilo){
        saldo -= cantidad;

        System.out.println(nombreHilo + " retira " + cantidad + "€" +
                "Su saldo: " + saldo + "€");
    }


    public synchronized double getSaldo(){
        return saldo;
    }

}
