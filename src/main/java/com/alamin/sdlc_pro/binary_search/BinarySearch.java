package com.alamin.sdlc_pro.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;
//        System.out.println(binarySearch(nums, target));
        int index = binarySearch(nums, target);
        System.out.println(lowerBound(nums, index));
        System.out.println(upperBound(nums, index));
    }
    private static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    private static int lowerBound(int[] nums, int index){
        int target = nums[index];
        int lowerIndex = index;
        index--;
        while (index >= 0 && nums[index] == target){
            lowerIndex = index;
            index--;
        }
        return lowerIndex;
    }
    private static int upperBound(int[] nums, int index){
        int target = nums[index];
        int lowerIndex = index;
        index++;
        while (index < nums.length && nums[index] == target){
            lowerIndex = index;
            index++;
        }
        return lowerIndex;
    }
}
