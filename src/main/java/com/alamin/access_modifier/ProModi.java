package com.alamin.access_modifier;

public class ProModi extends ProtectedModifier{
    public int m1(){
        System.out.println(value);
        return new ProModi().value;
    }

}
