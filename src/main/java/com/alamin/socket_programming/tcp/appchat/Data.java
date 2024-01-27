package com.alamin.socket_programming.tcp.appchat;

import java.io.Serializable;

public class Data implements Serializable,Cloneable{

    public String message;

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
