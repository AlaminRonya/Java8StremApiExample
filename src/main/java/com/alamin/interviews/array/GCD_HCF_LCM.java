package com.alamin.interviews.array;

public class GCD_HCF_LCM {
    public static void main(String[] args) {
        int a = 7, b = 3;
        System.out.println(findLcmTwoNumber(a, b));
        System.out.println(findLcmTwoNumber(a, b));
    }
    private static int findLcmTwoNumber(int a, int b){
        /**
         * time complexity
         * O( a*b - max(a, b)
         */

        int result = Math.max(a, b);
        while (true){
            if (result % a == 0 && result % b == 0){
             break;
            }
            result++;
        }
        return result;
    }
    private static int lcmUsingGCD(int a, int b){
        /**
         * Efficient Second Approach
         * LCM(a, b) = (a*b)/ GCD(a,b)
         * Optimised Euclid's Algorithms
         * O(log(min(a,b)))
         */
        return (a*b)/ euclidGCD(a, b);
    }
    private static int euclidGCD(int a, int b){
        while (a != 0 && b != 0){
            if (a>b){
                a = a % b;
            }else {
                b = b % a;
            }
        }
        if (a != 0){
            return a;
        }
        return b;
    }
}
