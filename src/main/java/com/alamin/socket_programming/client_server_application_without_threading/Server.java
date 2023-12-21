package com.alamin.socket_programming.client_server_application_without_threading;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2222);
        System.out.println("Server Started.............");
        while (true){
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected...........");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            try {
                //Read from Client
                Object clientMsg = ois.readObject();
                System.out.println("From Client: "+clientMsg.toString());
                String serverMsg = (String) clientMsg;
                // Send to client
                oos.writeObject(serverMsg.toUpperCase());

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }



    }
}
