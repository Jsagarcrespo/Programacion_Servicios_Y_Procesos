public class Sala {

    private int personas = 0;
    private int temperatura = 20;

    public synchronized int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public synchronized int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public synchronized void entrar(int idPersona) {

        while (personas >= 50 || (temperatura > 30 && personas >= 35)) {
            try {

                System.out.println(
                        "Persona " + idPersona +
                                " espera para entrar. Personas: " + personas +
                                "Temperatura: " + temperatura + "ºC"
                );
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                "Persona " + idPersona +
                        "ha entrado. Personas: " + personas +
                        "Temperatura: " + temperatura
        );

        notifyAll();

    }

    public synchronized void salir(int idPersona){

        while(personas <= 0){

            try {
                System.out.println(
                        "Persona " + idPersona +
                                " espera para salir porque no hay personas"
                );

                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        personas--;
        System.out.println(
                "Persona " + idPersona +
                        " ha salido. Personas: " + personas
        );

        notifyAll();
    }

    public synchronized void cambiarTemperatura(int nuevaTemp){

        temperatura = nuevaTemp;

        System.out.println(
                "Temperatura: " + temperatura
        );

        if (temperatura > 30){
            System.out.println("temperatura superior a 30");
        }else {
            System.out.println("temperatura normal");
        }

        notifyAll();

    }

}
