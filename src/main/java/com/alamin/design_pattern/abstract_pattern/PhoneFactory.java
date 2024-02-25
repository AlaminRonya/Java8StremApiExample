package com.alamin.design_pattern.abstract_pattern;

public class PhoneFactory {
    public static Phone createPhone(String name){
        return switch (name){
            case "iphone"-> new IPhone();
            case "oppo"-> new Oppo();
            default -> throw new IllegalArgumentException("Invalid");
        };
    }
}
