void main() throws InterruptedException {

    CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);

    Thread[] hilos = new Thread[10];

    for (int i = 0; i < 5; i++) {
        hilos[i] = new HiloIngreso(cuentaBancaria, "Ingreso-" + (i + 1));
    }

     for (int i = 0; i < 5; i++) {
        hilos[i +5] = new HiloRetiro(cuentaBancaria, "Ingreso-" + (i + 1));
    }

     for (Thread hilo : hilos){
         hilo.start();
     }

     for (Thread hilo: hilos){
         try {
             hilo.join();
         }catch (InterruptedException e){
             System.out.println("se ha interrumpido");
         }
     }


    System.out.println("Saldo final: " +  cuentaBancaria.getSaldo());

}
