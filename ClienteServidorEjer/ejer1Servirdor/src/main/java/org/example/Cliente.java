package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket conexion = new Socket("localhost", 6000);
        System.out.println("Conexion correcta");

        PrintWriter escribir =
                new PrintWriter(conexion.getOutputStream(), true);

        escribir.println("Hola servidor");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );

        String respuesta = br.readLine();

        System.out.println("Respuesta del servidor: " + respuesta);

        conexion.close();
    }
}