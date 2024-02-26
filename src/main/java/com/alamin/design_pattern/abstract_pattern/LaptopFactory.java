package com.alamin.design_pattern.abstract_pattern;

public class LaptopFactory implements DeviceFactory{
    public static Laptop createLaptop(String name){
        return switch (name){
            case "hp" -> new Hp();
            case "dell" -> new Dell();
            default -> throw new IllegalArgumentException("Invalid");
        };
    }

    @Override
    public Device createDevice(String name) {
        return switch (name){
            case "hp" -> new Hp();
            case "dell" -> new Dell();
            default -> throw new IllegalArgumentException("Invalid");
        };
    }
}
