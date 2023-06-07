package com.alamin.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedElementArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,4,5,6,7,8,9,6,7};
        Set<Integer> duplicatedElement = new HashSet<>();
        for (Integer v: nums){
            if (!duplicatedElement.add(v)){
                System.out.println(v);
            }
        }
    }
}
