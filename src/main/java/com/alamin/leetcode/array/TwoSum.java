package com.alamin.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,4};
        int[] sum = twoSum(nums, 5);
        for (Integer value: sum){
            System.out.print(value+ ",");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null){
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
