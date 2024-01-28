package com.alamin.socket_programming.tcp.multiClientInteractiveSessions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerConnection implements Runnable{
    private Socket server;
    private BufferedReader in;
//    private PrintWriter out;
    public ServerConnection(Socket  socket) {
        try {
            this.server = socket;
            this.in = new BufferedReader(new InputStreamReader(server.getInputStream()));
//            this.out = new PrintWriter(server.getOutputStream(), true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

            try {
                while (true) {
                    String serverResponse = in.readLine();
                    if (serverResponse == null){
                        break;
                    }
                    System.out.println("ServerConnection says: "+serverResponse);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
//                out.close();
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
