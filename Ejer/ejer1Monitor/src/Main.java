void main() throws InterruptedException {

    Restaurante restaurante = new Restaurante();

    for (int i = 0; i < 10; i++) {

        Cliente cliente = new Cliente(
                restaurante,
                "Cliente " + 1
        );

        cliente.start();
    }
    
    
    
    ////

    for (int i = 0; i < 10; i++) {
        
    }

}
