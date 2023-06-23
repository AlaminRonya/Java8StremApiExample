package com.alamin.sdlc_pro;

public class OOPs {
    public static int intValue; // static or class variable
    public static float floatValue = 100.45f; // static or class variable
    public static final int finalValue = 10; // static or class variable
    /*
        **************
        *Compiling Time*
        **************
        public static int intValue;
        public static float floatValue;
        public static final int finalValue;
        static {  <clinit> class initialization.
                intValue = 100;
                floatValue = 100.45f;
                * Note: When Class Loader SubSystem
                * Prepare section assign the default value {intValue=0;floatValue = 0.0f;} and
                * Initialization section assign the actual value {intValue=100;floatValue = 100.45f;}

                finalValue = 10;
                * Note: When Class Loader SubSystem
                * Prepare section assign the default & actual value are same time {finalValue = 10;}
        }
     */
    private int instanceVariable = 10; // instance variable
    /*
            **************
            *Compiling Time*
            **************
            private int instanceVariable;
            public OOPs(){  <init> object initialization.
                    instanceVariable = 10;
            }
    */
    {
        // Write the code common relationship all constructor for instance block
    }
    public static void main(String[] args) {

    }
}
