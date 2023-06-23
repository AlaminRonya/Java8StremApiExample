package com.alamin.interviews;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
        System.out.println(reverseInteger(-123));
    }
    private static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static int reverseInteger(int n){
        long t = 0;
        while (n != 0){
            t = t * 10 + n%10;
            n = n/10;
        }
        if (t <= Integer.MIN_VALUE || t >= Integer.MAX_VALUE){
            return 0;
        }
        return (int) t;
    }
}
