package com.alamin.interviews.binary_search;

public class CountOfSmallerOrEqualElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {19, 23, 56, 61, 72, 73, 73, 88, 92};
        System.out.println(countOfSmallerOrEqualElementsInAnArray(nums, 74));
    }
    private static int countOfSmallerOrEqualElementsInAnArray(int[] nums, int key){
        int length = nums.length;
        if (length < 1){
            return  0;
        }
        int lowIndex = 0, midIndex = 0,  highIndex = length - 1;
        while (lowIndex <= highIndex){
            midIndex = (lowIndex+highIndex)/2;
            if (key == nums[midIndex]){
                while (midIndex+1 < length && key == nums[midIndex]){
                    midIndex++;
                }
                break;
            }else if (key < nums[midIndex]){
                highIndex = midIndex - 1;
            }else {
                lowIndex = midIndex + 1;
            }
        }
        return nums[midIndex] != key ? midIndex : midIndex + 1;
    }
}
