package com.alamin.socket_programming.group_chat_ok;

import java.io.*;
import java.net.*;

public class GroupChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Connected to the server.");

            Thread receiverThread = new Thread(new Receiver(serverReader));
            receiverThread.start();

            String message;
            while ((message = consoleReader.readLine()) != null) {
                writer.println(message);
                if (message.equalsIgnoreCase(EXIT_COMMAND)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Receiver implements Runnable {
        private final BufferedReader serverReader;

        public Receiver(BufferedReader serverReader) {
            this.serverReader = serverReader;
        }

        @Override
        public void run() {
            try {
                String message;
                while ((message = serverReader.readLine()) != null) {
                    System.out.println("Received from server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

