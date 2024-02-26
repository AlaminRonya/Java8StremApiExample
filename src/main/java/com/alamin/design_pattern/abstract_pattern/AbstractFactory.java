package com.alamin.design_pattern.abstract_pattern;

public abstract class AbstractFactory {
    public static  DeviceFactory createFactory(String name){
        return switch (name){
            case "phone_factory" -> new PhoneFactory();
            case "laptop_factory" -> new LaptopFactory();
            default -> throw new IllegalArgumentException("Can't build any kinds of factory");
        };
    }
}
