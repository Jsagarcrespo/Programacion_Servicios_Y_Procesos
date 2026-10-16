package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(4999);
        // recoger peticiones
        Socket cliente = servidor.accept();
        System.out.println("Atiendo al cliente" + LocalDateTime.now());

        BufferedReader br = new BufferedReader(
                new InputStreamReader(cliente.getInputStream())
        );

        String mensaje = br.readLine();
        System.out.println("Mensaje recibido: " + mensaje);

        PrintWriter escribir =
                new PrintWriter(cliente.getOutputStream(), true);

        escribir.println("La fecha del sistema y la hora es:" + LocalDateTime.now());

        cliente.close();
        servidor.close();
    }
}