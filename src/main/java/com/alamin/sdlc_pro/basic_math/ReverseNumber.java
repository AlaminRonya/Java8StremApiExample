package com.alamin.sdlc_pro.basic_math;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = -100;
        System.out.println(reverseNumber(num));
    }
    private static int reverseNumber(int num){
        if (Integer.MIN_VALUE == num || Integer.MAX_VALUE == num){
            throw new RuntimeException("Invalid Number");
        }
        if (-10 < num && num < 10){
            return num;
        }
        long temp = 0;
        while (num != 0){
            temp = temp * 10 + num % 10;
            num /= 10;
        }
        if (Integer.MIN_VALUE > temp || Integer.MAX_VALUE < temp){
            throw new RuntimeException("Invalid Number");
        }
        return (int) temp;
    }
}
