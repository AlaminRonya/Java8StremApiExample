package com.alamin.jvm;
class Parent{
    static {
//        Child.objValue = null;
//        Child.staticValue = 0;
//        Child.constantValue = 30;
        System.out.println("Start Static Block of Parent");
        System.out.println("Prepare of objValue : "+ Child.objValue);
        System.out.println("Prepare of staticValue : "+ Child.staticValue);
        System.out.println("Prepare of  constantValue : "+ Child.constantValue);
        System.out.println("End Static Block of Parent");
        System.out.println("****************");
    }
}
public class Child extends Parent{
    public static Object objValue = new Object();
    public static int staticValue = 20;
    public static final int constantValue = 30;
    static {
//        objValue = new Object();
//        staticValue = 20;
        System.out.println("Start Static Block of Child");
        System.out.println("Initialization of objValue : "+ Child.objValue);
        System.out.println("Initialization of staticValue : "+ Child.staticValue);
        System.out.println("Initialization of  constantValue : "+ Child.constantValue);
        System.out.println("End Static Block of Child");
        System.out.println("****************");
    }

    public static void main(String[] args) {
        System.out.println("*******End of Main Class*********");
    }
}
