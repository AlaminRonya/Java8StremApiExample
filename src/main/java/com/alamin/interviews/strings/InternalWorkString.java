package com.alamin.interviews.strings;

public class InternalWorkString {
    public static void main(String[] args) {
        String a = "Al Amin";
        String b = new String("Al Amin");
        String c = b.intern();
        System.out.println("a == b is "+(a==b));
        System.out.println("a == c is "+(a==c));
    }
}
