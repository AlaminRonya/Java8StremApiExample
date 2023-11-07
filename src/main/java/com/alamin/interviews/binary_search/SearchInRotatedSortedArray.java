package com.alamin.interviews.binary_search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,1,2};
        System.out.println(searchInRotatedSortedArray(nums, 2));
    }
    private static int searchInRotatedSortedArray(int[] nums, int target){
        int length = nums.length;
        if (length < 1){
            return -1;
        }
        int l = 0, m = 0,h = length - 1;
        while (l <= h){
            m = (h+l)/2;
            if (target == nums[m]){
                return m;
            }else if (nums[l] <= nums[m]){
                if (target >= nums[l] && target < nums[m]){
                    h = m -1;
                }else {
                    l = m + 1;
                }
            }else {
                if (target > nums[m] && target <= nums[h]){
                    l = m + 1;
                }else {
                    h = m - 1;
                }
            }

        }
        return -1;
    }
}
