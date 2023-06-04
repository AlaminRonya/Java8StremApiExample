package com.alamin.leetcode.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {11,-5,91,22,-13,10,-25,12,42,19,31,-17,35,44};
        int target = 100;
        List<Integer> list = threeSum(nums, target);
        System.out.println("Complexity n^2: "+list);

    }

    public static List<Integer> threeSum(int[] nums, int target){
        for (int i = 0; i < nums.length-2; i++) {
            List<Integer> result = twoSum(
                    nums,
                    target-nums[i],
                    i
            );
            if (!result.isEmpty()){
                return List.of(result.get(0), result.get(1), nums[i]);
            }
        }
        return Collections.emptyList();
    }
    public static List<Integer> twoSum(int[] nums, int target, int start){
        Set<Integer> complements = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (complements.contains(target- nums[i])){
                return List.of(target-nums[i], nums[i]);
            }
            complements.add(nums[i]);
        }
        return Collections.emptyList();
    }
}
