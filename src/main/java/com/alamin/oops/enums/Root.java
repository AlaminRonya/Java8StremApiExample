package com.alamin.oops.enums;

import java.util.EnumMap;
import java.util.EnumSet;

import static com.alamin.oops.enums.Level.*;

public class Root {
    public static void main(String[] args) {
        Level level = LOW;
        var value = switch (level){
            case LOW-> Level.valueOf("LOW");
            case MEDIUM -> Level.valueOf("MEDIUM");
            case HIGH -> Level.valueOf("HIGH");
        };
        System.out.println(value+"=>"+value.ordinal());
        System.out.println("**************************");
        var values = Level.values();
        for (var v : values){
            System.out.println(v.name());
        }
        System.out.println("*************************");
        CustomEnum customEnum = CustomEnum.LOW;
        System.out.println(customEnum.getValue());
        System.out.println(CustomEnum.HIGH.normalize());
        System.out.println(CustomEnum.MEDIUM.normalize());
        System.out.println(CustomEnum.LOW.normalize());
//        CustomEnum.FEMALE.normalize();

        EnumSet enumSet = EnumSet.of(CustomEnum.LOW, CustomEnum.MEDIUM, CustomEnum.HIGH);
        System.out.println(enumSet);
        EnumMap<CustomEnum, String> enumMap = new EnumMap<>(CustomEnum.class);
        enumMap.put(CustomEnum.LOW, "Low value");
        enumMap.put(CustomEnum.MEDIUM, "Medium value");
        enumMap.put(CustomEnum.HIGH, "High value");
        System.out.println(enumMap);
    }
}
