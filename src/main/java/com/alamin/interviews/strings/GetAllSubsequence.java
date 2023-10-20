package com.alamin.interviews.strings;

import java.util.ArrayList;
import java.util.List;
// SubSequence = 2^k, k of length
public class GetAllSubsequence {
    public static void main(String[] args) {
       String s = "abab";
       List<String> result = new ArrayList<>();
       getAllSubSequence(s, "", result);

        System.out.println(result);
    }
    private static void getAllSubSequence(String s, String ans, List<String> result){
        if (s == null || s.length() == 0){
            result.add(ans);
            return;
        }
        getAllSubSequence(s.substring(1), ans+s.charAt(0), result);
        getAllSubSequence(s.substring(1), ans, result);
    }
}
