public class Main {

    public static void main(String[] args) throws InterruptedException {

        Pista pista = new Pista();

        Thread limpieza = new Thread(new Limpieza(pista));
        limpieza.start();

        Thread usuario1 = new Thread(new Usuario(1, pista));
        Thread usuario2 = new Thread(new Usuario(2, pista));
        Thread usuario3 = new Thread(new Usuario(3, pista));
        Thread usuario4 = new Thread(new Usuario(4, pista));
        Thread usuario5 = new Thread(new Usuario(5, pista));
        Thread usuario6 = new Thread(new Usuario(6, pista));
        Thread usuario7 = new Thread(new Usuario(7, pista));
        Thread usuario8 = new Thread(new Usuario(8, pista));
        Thread usuario9 = new Thread(new Usuario(9, pista));
        Thread usuario10 = new Thread(new Usuario(10, pista));

        usuario1.start();
        usuario2.start();
        usuario3.start();
        usuario4.start();
        usuario5.start();
        usuario6.start();
        usuario7.start();
        usuario8.start();
        usuario9.start();
        usuario10.start();

        usuario1.join();
        usuario2.join();
        usuario3.join();
        usuario4.join();
        usuario5.join();
        usuario6.join();
        usuario7.join();
        usuario8.join();
        usuario9.join();
        usuario10.join();

        System.out.println("Todos los usuarios han terminado");

        System.exit(0);
    }
}
