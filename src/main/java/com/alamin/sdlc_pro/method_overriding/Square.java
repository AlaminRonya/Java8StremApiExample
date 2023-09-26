package com.alamin.sdlc_pro.method_overriding;

public class Square extends Shape {
    public Square() {
        super();
        System.out.println("Square constructor");
    }

    @Override
    public Square getObject(){
        System.out.println("............Called to Square method................!");
        return new Square();
    }
}
