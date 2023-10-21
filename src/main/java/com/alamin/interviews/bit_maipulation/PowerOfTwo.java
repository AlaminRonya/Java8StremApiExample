package com.alamin.interviews.bit_maipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 41;
        System.out.println(isPowerOfTwo(n));
    }
    private static boolean isPowerOfTwo(int n){
        return n > 0 && (n & (n-1)) == 0;
    }
}
