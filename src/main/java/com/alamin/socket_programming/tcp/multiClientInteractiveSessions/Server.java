package com.alamin.socket_programming.tcp.multiClientInteractiveSessions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static  String[] names = {"Alamin", "Rony", "Java"};
    private static  String[] adjs = {"the gentle", "the un-gentle", "the urbane"};
    private static final int PORT = 9090;
    private static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(PORT);
        while (true){
            System.out.println("[SERVER] Waiting for client connection...");
            Socket client = listener.accept();
            System.out.println("[SERVER] Connected to client...");
            ClientHandler clientHandler = new ClientHandler(client, clientHandlers);
            clientHandlers.add(clientHandler);
            executorService.execute(clientHandler);
        }


//        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
//        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
//        try {
//            while (true){
//                String request = in.readLine();
//                if (request.contains("name")){
//                    out.println(getRandomName());
//                }else {
//                    out.println("Type 'tell me a name' to get a random name");
//                }
//            }
//        }catch (IOException e){
//            System.err.println("IO Exception in Server");
//            System.err.println(Arrays.toString(e.getStackTrace()));
//        } finally{
//            in.close();
//            out.close();
//        }

    }


    public static String getRandomName(){
        String name = names[(int)(Math.random() * names.length)];
        String adj = adjs[(int)(Math.random() * adjs.length)];
       return name+" "+adj;
    }
}
