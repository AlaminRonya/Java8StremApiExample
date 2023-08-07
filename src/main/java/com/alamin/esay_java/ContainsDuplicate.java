package com.alamin.esay_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,4,5,0,3,6};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));

    }
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> numSet = new HashSet<>();
//        for (int i = 0; i <= nums.length/2; i++) {
//            if (numSet.contains(nums[i]) ) {
//                return true;
//            }
//            numSet.add(nums[i]);
//
//        }
//        return false;
//    }
public  boolean containsDuplicate(int[] nums) {
    int n = nums.length;
    int[] seen = new int[n];

    for (int i = 0; i < n; i++) {
        if (seen[nums[i]] == 1) {
            return true;
        }
        seen[nums[i]] = 1;
    }

    return false;
}

//    public boolean containsDuplicate(int[] nums) {
//        List<Integer> bitVector = new ArrayList<>();
//        for (int num : nums) {
//            int index = num / 32;
//            int bit = 1 << (num % 32);
//
//            if ((bitVector.get(index) & bit) != 0) {
//                return true;
//            }
//
////            bitVector.get(index).toSt |= bit;
//        }
//        return false;
//    }
}
