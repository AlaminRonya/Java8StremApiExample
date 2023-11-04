package com.alamin.interviews.array;

public class SieveOfEratosthenesPrimeNumber {
    private static boolean[] cache;
    public static void main(String[] args) {
        sievePrintPrime(20);
    }
    private static void sievePrintPrime(int n){
        cache = new boolean[n + 1];

        for (int i = 2; i*i <= n; i++){
            if (!cache[i]){
                for (int j = i*i; j <= n ; j = j+i) {
                   cache[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!cache[i]){
                System.out.println(i);
            }
        }
    }
}
