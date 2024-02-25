package com.alamin.design_pattern;

import com.alamin.design_pattern.abstract_pattern.Laptop;
import com.alamin.design_pattern.abstract_pattern.LaptopFactory;
import com.alamin.design_pattern.abstract_pattern.Phone;
import com.alamin.design_pattern.abstract_pattern.PhoneFactory;

public class RootFactory {
    public static void main(String[] args) {
        Phone phone = PhoneFactory.createPhone("iphone");
        phone.info();
        Laptop laptop = LaptopFactory.createLaptop("hp");
        laptop.info();
    }
}
