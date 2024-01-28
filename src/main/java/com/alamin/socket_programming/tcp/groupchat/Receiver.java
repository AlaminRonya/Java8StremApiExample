package com.alamin.socket_programming.tcp.groupchat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

class Receiver implements Runnable {
    private final MulticastSocket socket;

    public Receiver(MulticastSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}