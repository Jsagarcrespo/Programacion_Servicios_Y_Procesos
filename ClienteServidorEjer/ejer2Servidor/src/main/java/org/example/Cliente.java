package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket conexion = new Socket("localhost", 4999);

        PrintWriter escribir =
                new PrintWriter(conexion.getOutputStream(), true);

        escribir.println("Hola servidor");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );

        String respuesta = br.readLine();

        System.out.println("Mensaje escrito desde el server: " + respuesta);

        conexion.close();
    }
}