package com.alamin.design_pattern.abstract_pattern;


public class RootFactory {
    public static void main(String[] args) {
//        Phone phone = PhoneFactory.createPhone("iphone");
//        phone.info();
//        Laptop laptop = LaptopFactory.createLaptop("hp");
//        laptop.info();
        // TODO: 25/02/2024 Abstract Factory Pattern
        Device device = AbstractFactory.createFactory("phone_factory").createDevice("iphone");
        device.info();
    }
}
