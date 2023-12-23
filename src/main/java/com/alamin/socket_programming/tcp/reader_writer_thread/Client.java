package com.alamin.socket_programming.tcp.reader_writer_thread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client started..");
        Socket socket = new Socket("192.168.137.1", 22222);
        System.out.println("Client Connected..");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        new WriterThread(oos, "Client1");
        new ReaderThread(ois, "Client1");
//        socket.close();

    }
}