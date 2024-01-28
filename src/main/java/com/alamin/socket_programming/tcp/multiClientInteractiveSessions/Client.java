package com.alamin.socket_programming.tcp.multiClientInteractiveSessions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT =9090;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);
        ServerConnection serverConnection = new ServerConnection(socket);

//        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        new Thread(serverConnection).start();
        while (true){
            System.out.println("=>");
            String command = keyboard.readLine();
            if (command.contains("quit")){
                break;
            }
            out.println(command);
//            String serverResponse = input.readLine();
//            System.out.println("Server says: "+serverResponse);
        }

    }

}
