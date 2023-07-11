package com.alamin.sdlc_pro.statics;

public class Main {
    // TODO: Declare the Properties
    private final int value;
    private static final int staticValue;
    private int properties;

    static { // Static Initialization Block or static variables initial statement
        staticValue = 200;
    }

    { // Instance Initialization Block or common code all constructor properties
        value = 100;
    }

    public Main() {
        /*
            {  Instance Initialization Block automatic sets to the constructor
                value = 100;
            }
        */
    }

    public Main(int properties) {
        /*
            {  Instance Initialization Block automatic sets to the constructor
                value = 100;
            }
        */
        this.properties = properties;
    }

    public static void main(String[] args) {
        System.out.println(Main.staticValue);
        System.out.println(new Main().value);
        System.out.println(new Main().properties);
        System.out.println(new Main(123).properties);
    }
}
