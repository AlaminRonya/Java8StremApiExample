package com.alamin.socket_programming.tcp.groupchat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

class Sender implements Runnable {
    private final MulticastSocket socket;
    private final InetAddress group;
    private final int port;

    public Sender(MulticastSocket socket, InetAddress group, int port) {
        this.socket = socket;
        this.group = group;
        this.port = port;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase(GroupChat.EXIT_COMMAND)) {
                    break;
                }
                byte[] buffer = message.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, port);
                socket.send(packet);
            }
            socket.leaveGroup(group);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
