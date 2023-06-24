package com.alamin.interviews;

public class ReplaceSpecialCharacters {
    public static void main(String[] args) {
        String str = "$ja!  va$% ";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        String resultSpecialChar = str.replaceAll("[a-zA-Z0-9]", "");
        String resultRevSpace = str.replaceAll("\\s", "");
        System.out.println(result + " : "+resultSpecialChar+" : "+resultRevSpace);
    }
}
