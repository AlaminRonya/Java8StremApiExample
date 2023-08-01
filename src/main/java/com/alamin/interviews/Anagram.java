package com.alamin.interviews;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("hello", "llohl"));
    }
    private static boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int sum = 0;
        for (int i = 0; i < s1.length(); i++){
            sum += s1.charAt(i);
            sum -= s2.charAt(i);
        }
        return sum == 0;
    }
}
