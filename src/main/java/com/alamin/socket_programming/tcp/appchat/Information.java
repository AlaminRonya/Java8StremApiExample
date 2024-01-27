package com.alamin.socket_programming.tcp.appchat;

public class Information {
    public String username;
    public NetworkConnection netConnection;
    public Information(String user, NetworkConnection nConnection){
        username=user;
        netConnection=nConnection;
    }

}