package com.alamin.sdlc_pro.basic_math;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 121;
//        System.out.println(reverseNumber(num));
        System.out.println(isPalindrome2(num));
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
    public static boolean isPalindrome(int x) {
        char[] msg = String.valueOf(x).toCharArray();
        int right = 0;
        int left = msg.length - 1;

        while (right <= left){
            if (msg[right] != msg[left]){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
    public static boolean isPalindrome2(int x) {
        int check = x;
        int temp = 0;
        while (x != 0){
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        return check == temp;
    }
}
