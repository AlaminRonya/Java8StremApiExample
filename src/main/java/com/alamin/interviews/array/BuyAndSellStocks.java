package com.alamin.interviews.array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int currMin = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < currMin){
                currMin = prices[i];
            }else {
                int profit = prices[i] - currMin;
                ans = Math.max(ans, profit);
            }
        }
        return ans;
    }
}
