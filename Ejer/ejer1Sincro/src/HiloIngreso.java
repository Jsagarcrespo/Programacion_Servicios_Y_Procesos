public class HiloIngreso extends Thread{

    public HiloIngreso(CuentaBancaria cuentaBancaria, String nombre) {
        super(nombre);
        this.cuentaBancaria = cuentaBancaria;
    }

    private CuentaBancaria cuentaBancaria;

    @Override
    public void run(){
        System.out.println("Comienza " + getName());

        for (int i = 0; i < 1000; i++) {
            cuentaBancaria.ingresar(10, getName());

        }

        System.out.println("Termina " + getName());

    }


}
