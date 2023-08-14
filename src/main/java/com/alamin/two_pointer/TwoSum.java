package com.alamin.two_pointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 18;
        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }
    public static int[] twoSum(int[] nums, int target){
        // TODO: 14/08/2023 base case
        if (nums.length < 2){
            return new int[]{-1,-1};
        }
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex){
            int sum = nums[leftIndex] + nums[rightIndex];
            if (sum == target){
                return new int[]{leftIndex+1, rightIndex+1};
            }else if (sum < target){
                leftIndex++;
            }else {
                rightIndex--;
            }
        }
        return new int[]{-1, -1};

    }
}
