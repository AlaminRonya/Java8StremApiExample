package com.alamin.esay_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
        String t = "aa", t1 = "bb";
        System.out.println(isAnagram(t, t1));
    }

//    public static boolean isPalindrome(String s) {
//        if (s.isEmpty() || s.length() == 1) return true;
//        Pattern pattern = Pattern.compile("[a-zA-Z]");
//        Matcher matcher = pattern.matcher(s);
//        StringBuilder result = new StringBuilder();
//        while (matcher.find()) {
//            result.append(matcher.group().toLowerCase());
//        }
//        char[] array = result.toString().toCharArray();
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//        while (firstIndex <= lastIndex){
//            if (array[firstIndex] != array[lastIndex]) return false;
//            firstIndex++;
//            lastIndex--;
//        }
//        return true;
//    }
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return true;
        char[] array = s.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int c = array[i] - 97;
            int digit  = array[i] - 48;
            if (0 <= c && c<=25   ){
                builder.append(array[i]);
            }else if (0 <= digit  && digit < 10){
                builder.append(array[i]);
            }
        }
        char[] chars = builder.toString().toCharArray();
        int firstIndex = 0;
        int lastIndex = chars.length - 1;
        while (firstIndex <= lastIndex){
            if (chars[firstIndex] != chars[lastIndex]) return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
    public static boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;
        char[] s1 = s.toLowerCase().toCharArray();
        char[] s2 = t.toLowerCase().toCharArray();
        int[] bitVector = new int[26];

        for (char c : s1) {
            bitVector[c - 'a']++;
        }
        for (char c : s2) {
            bitVector[c - 'a']--;
        }
        for (int i = 0; i < 26; i++){
            if (bitVector[i] == 0){
                continue;
            }else {
                return false;
            }

        }
        return true;
    }
}
