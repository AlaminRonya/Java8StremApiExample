package com.alamin.dynamicProgramming;

import java.util.HashMap;
//1134903170
//8674
public class FibonacciProgramming {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        System.out.println(fibo(45));
        System.out.println(optimizedFibo(45));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static int optimizedFibo(int n){
        return fibo(n, new HashMap<>());
    }
    private static int fibo(int n, HashMap<Integer, Integer> memo){
        if (n == 0 || n == 1){
            return n;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        int result = fibo(n-1, memo)+fibo(n-2, memo);
        memo.put(n, result);
        return result;
    }
}
