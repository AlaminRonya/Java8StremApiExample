package com.alamin.esay_java;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
//        String haystack = "hello", needle = "lla";
        String haystack = "mississippi", needle = "issipa";
        System.out.println(subStringFirstOccurrence(haystack, needle));

    }
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n/2;  i >= 1 ; i--) {
            if (n%i == 0){
                int num_repeats = n / i;
                String substring = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(substring.repeat(num_repeats));
                if (stringBuilder.toString().equals(s)) return true;
            }
        }
        return false;
    }

    public static int subStringFirstOccurrence(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
