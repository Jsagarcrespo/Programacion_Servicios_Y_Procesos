package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(6000);
        // recoger peticiones
        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(cliente.getInputStream())
        );

        String mensaje = br.readLine();
        System.out.println("Mensaje recibido: " + mensaje);

        PrintWriter escribir =
                new PrintWriter(cliente.getOutputStream(), true);

        escribir.println("Saludos desde el servidor");

        cliente.close();
        servidor.close();
    }
}