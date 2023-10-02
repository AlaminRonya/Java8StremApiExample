package com.alamin.sdlc_pro.wrapper;

public class WrapperClassInternalWork {
    public static void main(String[] args) {
//        Short b1 = new Short((short) 10);
//        Short b2 = new Short((short)10);
        Short b3 = Short.valueOf((short) 10);
        Short b4 = Short.valueOf((short) 10);
        Short b5 = (short) 128;
        Short b6 = (short) 128;

//        System.out.println("new Short((short) 10): "+(b1 == b2));
        System.out.println("Short.valueOf((short) 10): "+(b3 == b4));
        System.out.println("(short) 128 or Short.valueOf((short) 128): "+(b5 == b6));
        System.out.println("Cache Range: -128 to 127 than create new object.");
        System.out.println("Short b6 = (short) 128 :=> new Short((short)128)");
        Short s = 4656;
        System.out.println(Integer.toBinaryString(s));
        int reverse = Short.reverseBytes(s);
        System.out.println(Integer.toBinaryString(reverse));
    }
}
