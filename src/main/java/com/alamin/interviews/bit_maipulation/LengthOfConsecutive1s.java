package com.alamin.interviews.bit_maipulation;

public class LengthOfConsecutive1s {
    public static void main(String[] args) {
        System.out.println(isConsecutive1s(101));
        System.out.println(isConsecutive1sMaxLength(73));
    }
    private static boolean isConsecutive1s(int num){
        return (num & (num << 1)) != 0;
    }
    private static int isConsecutive1sMaxLength(int num){
        int count = 0;
        while (num > 0){
            num = num & (num << 1);
            count++;
        }
        return count;
    }
}
