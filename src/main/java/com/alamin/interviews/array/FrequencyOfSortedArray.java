package com.alamin.interviews.array;

import java.util.Arrays;

public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {20,20,20,30,30,30,40};
//        Arrays.sort(nums);
        frequency(nums);
    }
    private static void frequency(int[] nums){
        int length = nums.length;
        if (length < 1){
            return;
        }
        int freq = 1;
        int i = 1;
        int maxFrequency = Integer.MIN_VALUE;
        while (i < length){
            while (i < length-1 && nums[i-1] == nums[i]){
                freq++;
                i++;
            }
            maxFrequency = Math.max(freq, maxFrequency);
            System.out.println(nums[i-1]+" : "+freq);
            freq = 1;
            i++;
        }
        if (length == 1 || nums[i-2] != nums[i-1]){
            System.out.println(nums[i-1]+" : "+freq);
        }

        System.out.println(maxFrequency);
    }
}
