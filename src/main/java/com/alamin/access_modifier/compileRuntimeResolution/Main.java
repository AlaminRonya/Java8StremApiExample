package com.alamin.access_modifier.compileRuntimeResolution;

public class Main {
    public static void main(String[] args) {
//        Y obj1 = (Y) new X();
//        System.out.println(obj1.value2);

        X obj1 = new Y();
        System.out.println(obj1.value1);
//        System.out.println(obj1.value2);
        System.out.println(((Y) obj1).value2);
    }
}
