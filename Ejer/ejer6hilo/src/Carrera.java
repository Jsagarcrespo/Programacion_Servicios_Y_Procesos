public class Carrera {

    public static void main(String[] args) throws InterruptedException {

        Atleta at1 = new Atleta("atleta 1");
        Atleta at2 = new Atleta("atleta 2");
        Atleta at3 = new Atleta("atleta 3");
        Atleta at4 = new Atleta("atleta 4");

        at1.start();
        at2.start();
        at3.start();
        at4.start();

        at1.join();
        at2.join();
        at3.join();
        at4.join();

        System.out.println("la carreraha acabado");



    }

}
