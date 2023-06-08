package com.alamin.leetcode.array;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println(reverseDigit(-120));
    }
    public static int reverse(int x) {
        try {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
            char charAt = stringBuilder.charAt(0);
            boolean check = false;
            if (charAt == '-'){
                stringBuilder.delete(0,1);
                check = true;
            }

            int s = Integer.parseInt(stringBuilder.reverse().toString());

            return check ? ~(s - 1) : s;
        }catch (Exception e){

        }
        return 0;

    }
    private static int reverseDigit(int x){
        long temp = 0;
        while (x != 0){
           temp = (temp*10)+(x%10);
           x = x/10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
            return 0;
        }
        return (int) temp;
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length-1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
