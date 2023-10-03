package com.alamin.structy.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class MinChange {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int amount = 4;
        System.out.println(minChange(amount, nums));
        for (Map.Entry<Integer, Integer> n: memo.entrySet()){
            System.out.println(n);
        }
    }
    public static int minChange(int amount, int[] coins) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        int minCoins = -1;
        for (int coin : coins) {
            int subAmount = amount - coin;
            int subCoins = minChange(subAmount, coins);

            if (subCoins != -1) {
                int numCoins = 1 + subCoins;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }

        memo.put(amount, minCoins);
        return minCoins;
    }
}
