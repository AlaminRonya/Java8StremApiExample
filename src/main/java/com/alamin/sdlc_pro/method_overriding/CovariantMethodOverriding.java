package com.alamin.sdlc_pro.method_overriding;

// TODO: 25/09/2023 Covariant type overriding Shape and Circle class always return type change to child class name
public class CovariantMethodOverriding {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.getObject();
    }
}
