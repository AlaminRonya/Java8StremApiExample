package com.alamin.interviews.array;

public class FindCeilFloorOfAnNumberInASortedArray {
    public static void main(String[] args) {
        int[] nums = {19, 23, 56, 61, 72, 88, 92};
        System.out.println(ceil(nums, 73));
        System.out.println(floor(nums, 20));
    }
    private static int ceil(int[] nums, int key){
        int length = nums.length;
        int lowIndex = 0, midIndex = 0,  highIndex = length - 1;
        while (lowIndex <= highIndex){
            midIndex = (lowIndex+highIndex)/2;
            if (key == nums[midIndex]){
                return nums[midIndex];
            }else if (key < nums[midIndex]){
                highIndex = midIndex - 1;
            }else {
                lowIndex = midIndex + 1;
            }
        }

        return (lowIndex < length) ? nums[lowIndex] : -1;
    }
    private static int floor(int[] nums, int key){
        int length = nums.length;
        int lowIndex = 0, midIndex = 0,  highIndex = length - 1;
        while (lowIndex <= highIndex){
            midIndex = (lowIndex+highIndex)/2;
            if (key == nums[midIndex]){
                return nums[midIndex];
            }else if (key < nums[midIndex]){
                highIndex = midIndex - 1;
            }else {
                lowIndex = midIndex + 1;
            }
        }

        return (highIndex >= 0) ? nums[highIndex] : -1;
    }
}
