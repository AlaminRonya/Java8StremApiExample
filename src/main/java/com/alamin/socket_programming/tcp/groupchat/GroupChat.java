package com.alamin.socket_programming.tcp.groupchat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class GroupChat {
    public static final String EXIT_COMMAND = "exit";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("192.168.137.1");
            MulticastSocket socket = new MulticastSocket(PORT);
            socket.joinGroup(group);

            Thread sender = new Thread(new Sender(socket, group, PORT));
            Thread receiver = new Thread(new Receiver(socket));

            sender.start();
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
