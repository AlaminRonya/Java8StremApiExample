package com.alamin.socket_programming.tcp.client_server_application_without_threading;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Started............");
        Socket socket = new Socket("192.168.137.1", 2222);
        System.out.println("Client Connected............");
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Data: ");
        String s = scanner.nextLine();
        // Send to Server
        oos.writeObject(s);
        try {
            // Received from Server
            Object fromServer = ois.readObject();
            System.out.println("From Server: "+fromServer.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
