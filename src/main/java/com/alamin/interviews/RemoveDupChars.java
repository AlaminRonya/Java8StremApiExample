package com.alamin.interviews;
/*
    1.  Using Java 8
    2.  Using indexOf(..)
    3.  Using Character array
    4.  Using Set interface method
 */
public class RemoveDupChars {
    public static void main(String[] args) {
        String str = "programming";
        // Approach-1
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);

        // Approach-2
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int inx = str.indexOf(ch, i+1);
            if (inx == -1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean repated = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    repated = true;
                    break;
                }
            }
            if (!repated){
                sb3.append(arr[i]);
            }

        }
        System.out.println(sb3);
    }
}
