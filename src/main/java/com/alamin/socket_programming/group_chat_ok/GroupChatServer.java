package com.alamin.socket_programming.group_chat_ok;

import java.io.*;
import java.net.*;
import java.util.*;

public class GroupChatServer {
    private static final int PORT = 12345;
    private static final String EXIT_COMMAND = "exit";

    private static Set<PrintWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                clientWriters.add(writer);
                new Thread(new ClientHandler(clientSocket, writer)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private final Socket clientSocket;
        private final PrintWriter writer;

        public ClientHandler(Socket socket, PrintWriter writer) {
            this.clientSocket = socket;
            this.writer = writer;
        }

        @Override
        public void run() {
            try (
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
            ) {
                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println("Received from client: " + message);
                    if (message.equalsIgnoreCase(EXIT_COMMAND)) {
                        break;
                    }
                    broadcast(message);
                }
                clientSocket.close();
                clientWriters.remove(writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void broadcast(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
            writer.flush();
        }
    }
}

