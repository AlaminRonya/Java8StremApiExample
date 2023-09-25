package com.alamin.sdlc_pro.method_overriding;

public class Circle extends Shape{
    public Circle() {
        super();
        System.out.println("Circle constructor");
    }

    @Override
    public Circle getObject() {
        System.out.println("............Called to Circle method................!");
        return new Circle();
    }
}
