package com.alamin.interviews.array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {20, 42, 6, 25, 30, 88};
        System.out.println(secondLargestElement(nums));
        System.out.println(secondSmallestElement(nums));
    }
    private static int secondLargestElement(int[] nums){
        int length = nums.length;
        if (length < 2){
            return -1;
        }
        int max1 = 0;
        int max2 = 0;
        if (nums[0] > nums[1]){
          max1 = nums[0];
          max2 = nums[1];
        }else {
            max1 = nums[1];
            max2 = nums[0];
        }
        int index = 2;
        while (index < length){
            if (nums[index] > max1){
                max2 = max1;
                max1 = nums[index];
            }else if (nums[index] > max2){
                max2 = nums[index];
            }
            index++;
        }
        return max2;
    }
    private static int secondSmallestElement(int[] nums){
        int length = nums.length;
        if (length < 2){
            return -1;
        }
        int max1 = 0;
        int max2 = 0;
        if (nums[0] < nums[1]){
            max1 = nums[0];
            max2 = nums[1];
        }else {
            max1 = nums[1];
            max2 = nums[0];
        }
        int index = 2;
        while (index < length){
            if (nums[index] < max1){
                max2 = max1;
                max1 = nums[index];
            }else if (nums[index] < max2){
                max2 = nums[index];
            }
            index++;
        }
        return max2;
    }
}
