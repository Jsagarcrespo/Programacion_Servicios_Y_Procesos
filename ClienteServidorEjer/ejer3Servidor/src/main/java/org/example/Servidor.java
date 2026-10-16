
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(4999);

        System.out.println("Servidor esperando clientes...");

        while (true) {

            Socket cliente = servidor.accept();

            System.out.println("Nuevo cliente conectado.");

            Thread hilo = new Thread(() -> {
                try {

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(cliente.getInputStream())
                    );

                    PrintWriter escribir = new PrintWriter(
                            cliente.getOutputStream(), true
                    );

                    String mensaje;

                    while ((mensaje = br.readLine()) != null) {

                        if (mensaje.equalsIgnoreCase("FIN")) {
                            System.out.println("Cliente desconectado.");
                            break;
                        }

                        System.out.println("Mensaje recibido: " + mensaje);

                        String respuesta = mensaje.toUpperCase();

                        escribir.println(respuesta);
                    }

                    cliente.close();

                } catch (IOException e) {
                    System.out.println("Error con un cliente: "
                            + e.getMessage());
                }
            });

            hilo.start();
        }
    }
}
