package com.alamin.sdlc_pro.method_overriding;

public class Shape {
    public Shape() {
        System.out.println("Shape constructor");
    }

    public Shape getObject(){
        System.out.println("............Called to Shape method................!");
        return new Shape();
    }
}
