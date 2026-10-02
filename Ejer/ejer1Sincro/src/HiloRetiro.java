public class HiloRetiro extends Thread{

    public HiloRetiro(CuentaBancaria cuentaBancaria, String nombre) {
        super(nombre);
        this.cuentaBancaria = cuentaBancaria;
    }

    private CuentaBancaria cuentaBancaria;

    @Override
    public void run(){

        System.out.println("Comienzo " + getName());

        for (int i = 0; i < 1000; i++) {
            cuentaBancaria.retirar(10, getName());
        }
        System.out.println("Termina " + getName());
    }



}
