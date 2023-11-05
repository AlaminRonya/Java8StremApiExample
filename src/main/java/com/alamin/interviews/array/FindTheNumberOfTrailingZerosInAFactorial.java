package com.alamin.interviews.array;

public class FindTheNumberOfTrailingZerosInAFactorial {
    public static void main(String[] args) {
        findTheNumberOfTrailingZerosInAFactorial(25);
    }
    private static void findTheNumberOfTrailingZerosInAFactorial(int n){
        int result = 0;
        int powerOf5 = 5;
        while (powerOf5 <= n){
            int temp = n/powerOf5;
            result += temp;
            powerOf5 *= 5;
        }
        System.out.println(result);
    }
}
