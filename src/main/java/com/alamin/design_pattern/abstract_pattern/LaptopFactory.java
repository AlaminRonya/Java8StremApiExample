package com.alamin.design_pattern.abstract_pattern;

public class LaptopFactory {
    public static Laptop createLaptop(String name){
        return switch (name){
            case "hp" -> new Hp();
            case "dell" -> new Dell();
            default -> throw new IllegalArgumentException("Invalid");
        };
    }
}
