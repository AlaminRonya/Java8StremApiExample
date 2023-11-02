package com.alamin.interviews.array;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberOptimisedCode {
    public static void main(String[] args) {
        System.out.println(isPrime(17));

    }
    private static int countPrimeSetBits(int left, int right){
        int count = 0;
        for (int i = left; i <= right ; i++) {
            if (isPrime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        if (num == 2 || num == 3){
            return true;
        }
        if (num%2 == 0 || num%3 == 0){
            return false;
        }
        for (int i = 5; i*i <= num; i += 6){
            if (num%i == 0 || num%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
