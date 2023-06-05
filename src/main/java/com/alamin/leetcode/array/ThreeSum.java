package com.alamin.leetcode.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {11,-5,91,22,-13,10,-25,12,42,19,31,-17,35,44};
        int target = 100;
        List<Integer> list = threeSum(nums, target);
        System.out.println("Complexity n^2: "+list);
        System.out.println("Complexity : "+threeSumOpt(nums, target));

        System.out.println("************************");
        List<List<Integer>> lists = threeSumOptAll(nums);
        lists.forEach(System.out::println);
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

    public static List<Integer> threeSumOpt(int[] nums, int target){
        Arrays.sort(nums);
        for (int left = 0; left < nums.length-2; left++){
            int middle = left+1;
            int right = nums.length-1;
            while (middle < right){
                int sum = nums[middle] + nums[right] + nums[left];
                if (sum == target){
                    return List.of(nums[left], nums[middle], nums[right]);
                }
                else if (sum > target){
                    do right--; while (middle < right && nums[right] == nums[right+1]);
                }else {
                    do middle++; while (middle < right && nums[middle] == nums[middle-1]);
                }
            }
        }
        return Collections.emptyList();
    }


    public static List<List<Integer>> threeSumOptAll(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int left = 0; left < nums.length-2; left++){
            int middle = left+1;
            int right = nums.length-1;
            while (middle < right){
                int sum = nums[middle] + nums[right] + nums[left];
                if (sum == 0){
//                    return List.of(nums[left], nums[middle], nums[right]);
                    result.add(Arrays.asList(nums[left], nums[middle], nums[right]));

                }
                if (sum > 0){
                    do right--; while (middle < right && nums[right] == nums[right+1]);
                }else {
                    do middle++; while (middle < right && nums[middle] == nums[middle-1]);
                }
            }
        }
        return result.stream().toList();
    }
}
