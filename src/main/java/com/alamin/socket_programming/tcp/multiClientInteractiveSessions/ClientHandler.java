package com.alamin.socket_programming.tcp.multiClientInteractiveSessions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class ClientHandler implements Runnable{
    private BufferedReader in;
    private PrintWriter out;
    private ArrayList<ClientHandler> clientHandlers;
    public ClientHandler(Socket client, ArrayList<ClientHandler> clientHandlers) {
        try {
            this.clientHandlers = clientHandlers;
            this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            this.out = new PrintWriter(client.getOutputStream(), true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String request = in.readLine();
            if (request.contains("name")){
                out.println(Server.getRandomName());
            }else if (request.contains("say")){
                int firstSpace = request.indexOf(" ");
                if (firstSpace != -1){
                    outToAll(request.substring(firstSpace+1));
                }
            }else {
                out.println("Type 'tell me a name' to get a random name");
            }
        }catch (IOException e){
            System.err.println("IO Exception in client handler");
            System.err.println(Arrays.toString(e.getStackTrace()));
        }finally {
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void outToAll(String msg) {
        for (ClientHandler aClient: clientHandlers) {
           aClient.out.println(msg);
        }
    }
}
