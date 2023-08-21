package com.alamin.two_pointer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        String s =  "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
    private static List<Integer> partitionLabels(String s){
        char[] array = s.toCharArray();
        int[] cache = new int[128];
        for (int i = 0; i < array.length; i++){
            char cur  = array[i];
            cache[cur] = i;
        }
        int l = 0, r = 0, index = 0;
        List<Integer> res = new ArrayList<>();
        while (index < array.length){
            char cur = array[index];
            r = Math.max(r, cache[cur]);
            if (r == index){
                int size = r - l + 1;
                res.add(size);
                r++;
                l = r;
            }
            index++;
        }
        return res;
    }
}

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new LinkedList<>();
        char[] arr = S.toCharArray();
        //1. Last appear character index save onto a table
        int[] map = new int[26];
        for(int i = 0; i < arr.length; i++){
            map[arr[i] - 'a'] = i;
        }

        //2. Define L and R
        int L = 0;
        int maxLastAppearIndex = 0;

        for(int R = 0; R < arr.length; R++){
            //Current Character Last appear index
            int curLastAppearIndex = map[arr[R] - 'a'];

            //Update the max last appear char index
            maxLastAppearIndex = Math.max(maxLastAppearIndex, curLastAppearIndex);

            if(maxLastAppearIndex == R){
                int len = R - L + 1;
                res.add(len);
                L = R + 1;
            }
        }

        return res;
    }
}
