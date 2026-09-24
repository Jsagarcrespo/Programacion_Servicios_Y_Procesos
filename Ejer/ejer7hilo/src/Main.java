void main() throws InterruptedException {


    Contador contador = new Contador();

    Hilo h1 = new Hilo(contador);
    Hilo h2 = new Hilo(contador);
    Hilo h3 = new Hilo(contador);
    Hilo h4 = new Hilo(contador);

    h1.start();
    h2.start();
    h3.start();
    h4.start();

    h1.join();
    h2.join();
    h3.join();
    h4.join();


}
