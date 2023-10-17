package com.alamin.interviews.array;

public class D2B {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(8, new StringBuilder()));
    }
    private static String decimalToBinary(int num, StringBuilder builder){
        if (num < 1){
            return builder.toString();
        }
         builder.insert(0, (num & 1) == 0 ? "0" : "1");
        return decimalToBinary(num/2, builder);

    }
}
