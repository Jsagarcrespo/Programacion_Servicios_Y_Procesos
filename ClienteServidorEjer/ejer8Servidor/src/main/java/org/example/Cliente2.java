package org.example;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente2 {

    public static void main(String[] args) {

        final String HOST = "localhost";
        final int PUERTO = 5000;

        Scanner teclado = new Scanner(System.in);

        try {

            // Pedimos los dos números
            System.out.print("Introduce el primer número: ");
            int numero1 = teclado.nextInt();

            System.out.print("Introduce el segundo número: ");
            int numero2 = teclado.nextInt();

            // Creamos el objeto
            Operacion operacion =
                    new Operacion(numero1, numero2);

            // Conectamos con el servidor
            Socket socket = new Socket(HOST, PUERTO);

            ObjectOutputStream salida =
                    new ObjectOutputStream(
                            socket.getOutputStream());

            ObjectInputStream entrada =
                    new ObjectInputStream(
                            socket.getInputStream());

            // Enviamos el objeto al servidor
            salida.writeObject(operacion);
            salida.flush();

            // Recibimos el objeto actualizado
            Operacion respuesta =
                    (Operacion) entrada.readObject();

            // Mostramos los tres valores
            System.out.println("\nDatos recibidos del servidor:");
            System.out.println("Número 1: "
                    + respuesta.getNumero1());

            System.out.println("Número 2: "
                    + respuesta.getNumero2());

            System.out.println("Resultado: "
                    + respuesta.getResultado());

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        teclado.close();
    }
}
