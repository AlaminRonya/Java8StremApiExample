package com.alamin.two_pointer;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates_I(arr));
        System.out.println(removeDuplicates_II(arr));
    }
    public static int removeDuplicates_I(int[] nums) {
        int length = nums.length;
        if (length < 1 ){
            return 0;
        }
        if (length == 1 ){
            return 1;
        }
        int slow  = 0;
        int fast = 1;
        while (fast < length){
            if (nums[slow] != nums[fast]){

                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;

    }
    public static int removeDuplicates_II(int[] nums) {
        int n = nums.length;
        if (n < 3 ){
            return n;
        }
        int left = 0, right = 1, counter = 0;
        while (right < n){
            if (nums[left] != nums[right]){
                counter = 0;
                nums[++left] = nums[right];
            }else if (nums[left] == nums[right] && counter < 1){
                counter++;
                nums[++left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
}
