package com.alamin.interviews;


public class StringReverseOptimize {
    public static void main(String[] args) {
        System.out.println( reverse("abc"));
    }
    private static String reverse(String str){
        char[] chars = str.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n/2; i++){
            char temp = chars[n-i-1];
            chars[n-i-1] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }
}
