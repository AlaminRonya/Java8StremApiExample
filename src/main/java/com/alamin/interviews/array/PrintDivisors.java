package com.alamin.interviews.array;

public class PrintDivisors {
    public static void main(String[] args) {
        printDivisorsOptimized(40);
        System.out.println("***********************************");
        printDivisorsOptimized1(40);
    }
    private static void printDivisors(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.println(i);
            }
        }
    }
    private static void printDivisorsOptimized(int n){
        for (int i = 1; i*i <= n; i++) {
            if (n%i == 0){
                System.out.println(i);
                int t = n/i;
                if (i != t){
                    System.out.println(n/i);
                }

            }
        }
    }
    private static void printDivisorsOptimized1(int n){
        int i = 0;
        for (i = 1; i*i <= n; i++) {
            if (n%i == 0){
                System.out.println(i);
            }
        }
        for (; i >=1; i--) {
            if (n%i == 0){
                System.out.println(n/i);
            }
        }
    }
}
