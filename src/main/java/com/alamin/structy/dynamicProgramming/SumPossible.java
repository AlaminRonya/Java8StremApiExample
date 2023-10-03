package com.alamin.structy.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class SumPossible {
    private static final Map<Integer, Boolean> memo = new HashMap<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int amount = 7;
        System.out.println(sumPossible(amount, nums));
    }

    private static boolean sumPossible(int amount, int[] nums){
        if (amount == 0){
            return true;
        }
        if (amount < 0){
            return false;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        for (int num : nums) {
            if (sumPossible(amount - num, nums)) {
                memo.put(amount, true);
                return true;
            }
        }
        memo.put(amount, false);
        return false;
    }
}
