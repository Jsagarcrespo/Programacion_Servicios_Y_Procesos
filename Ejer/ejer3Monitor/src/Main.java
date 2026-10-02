public class Main {
    public static void main(String[] args) throws InterruptedException {

        Sala sala = new Sala();

        int numPersonas = 60;

        Thread[] personas = new Thread[numPersonas];

        Thread temperatura = new Thread(new Temperatura(sala));

        temperatura.start();

        for (int i = 0; i < numPersonas; i++) {

            personas[i] = new Thread(new Persona(i + 1, sala).toString());

            personas[i].start();
        }

        for (int i = 0; i < numPersonas; i++) {
            personas[i].join();
        }

        temperatura.join();

        System.out.println(
                "Personas finales en la sala: " + sala.getPersonas()
        );

        System.out.println(
                "Temperatura final: " + sala.getTemperatura()
        );

    }
}

