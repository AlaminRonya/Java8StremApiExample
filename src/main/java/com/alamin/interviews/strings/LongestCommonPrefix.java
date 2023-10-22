package com.alamin.interviews.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println("abcd".substring(0, 3));
    }
    private static String longestCommonPrefix(String[] arr){
        if (arr == null || arr.length == 0){
            return "";
        }
        if (arr.length == 1){
            return arr[0];
        }
        String prefix = arr[0];
        System.out.println(prefix);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i].indexOf(prefix));
            while (arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
                System.out.println(prefix);
                System.out.println("=============");
            }
        }
        return prefix;
    }
}
