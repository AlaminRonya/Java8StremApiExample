package com.alamin.interviews.binary_search;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;
        System.out.println(binarySearch(nums, target));
    }
    private static int binarySearch(int[] nums, int target){
        int length = nums.length;
        if (length < 1){
            return Integer.MIN_VALUE;
        }
        int leftIndex = 0;
        int rightIndex = length - 1;
        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex+rightIndex) / 2;
            if (nums[midIndex] == target){
                return midIndex;
            }else if (nums[midIndex] < target){
                leftIndex = midIndex + 1;
            }else {
                rightIndex = midIndex - 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
