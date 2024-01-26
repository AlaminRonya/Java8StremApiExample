package com.alamin.socket_programming.tcp.group_chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.username = username;
        }catch (IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);

        }

    }

    public void sendMessage(){
        try {
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()){
                String messageToSend = scanner.nextLine();
                bufferedWriter.write(username+": "+messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }
    public void listenFromMessage(){
        new Thread(() -> {
//            String messageFromGroupChat;
            while (socket.isConnected()){
                System.out.println("---------");
                try {
                    System.out.println("******start******");
                    String messageFromGroupChat = bufferedReader.readLine();
                    System.out.println("*******end*****");
                    System.out.println(messageFromGroupChat);
                }catch (IOException e){
                    closeEverything(socket, bufferedReader, bufferedWriter);
                }
            }
        }).start();
    }
    private void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
//        removeClientHandler();
        try {
            if (bufferedReader != null){
                bufferedReader.close();
            }
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
            if (socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name for group chat: ");
        String username = scanner.nextLine();
        Socket socket = new Socket("localhost", 1234);
        Client client = new Client(socket, username);
        client.listenFromMessage();
        client.sendMessage();
    }
}
