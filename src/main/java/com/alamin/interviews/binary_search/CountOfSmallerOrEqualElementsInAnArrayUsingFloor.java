package com.alamin.interviews.binary_search;

public class CountOfSmallerOrEqualElementsInAnArrayUsingFloor {
    public static void main(String[] args) {
        int[] nums = {19, 23, 56, 61, 72, 73, 73, 88, 92};
        System.out.println(countOfSmallerOrEqualElementsInAnArrayUsingFloorReturnOfIndex(nums, 99)+1);
    }

    private static int countOfSmallerOrEqualElementsInAnArrayUsingFloorReturnOfIndex(int[]nums, int key){
        int length = nums.length;
        if (length < 1){ return 0;}
        int low = 0, mid = 0, high = length - 1;
        while (low <= high){
            mid = (low+high)/2;
            if (key == nums[mid]){
                return mid;
            }else if (key < nums[mid]){
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }
        return (high >= 0) ? high : -1;
    }
}
