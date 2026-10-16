package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {

        ServerSocket servidor = new ServerSocket(6000);

        Socket cliente = servidor.accept();
        System.out.println("conexion correcta");


    }
}
