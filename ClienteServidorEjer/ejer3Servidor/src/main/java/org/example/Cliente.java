
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket conexion = new Socket("localhost", 4999);

        BufferedReader teclado = new BufferedReader(
                new InputStreamReader(System.in)
        );

        BufferedReader br = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );

        PrintWriter escribir = new PrintWriter(
                conexion.getOutputStream(), true
        );

        String mensaje;

        do {
            System.out.println("Escribe un mensaje (FIN para terminar):");
            mensaje = teclado.readLine();

            if (mensaje == null) {
                break;
            }

            escribir.println(mensaje);

            if (!mensaje.equalsIgnoreCase("FIN")) {
                String respuesta = br.readLine();
                System.out.println("Respuesta del servidor: " + respuesta);
            }

        } while (!mensaje.equalsIgnoreCase("FIN"));

        conexion.close();

        System.out.println("Conexion finalizada.");
    }
}
