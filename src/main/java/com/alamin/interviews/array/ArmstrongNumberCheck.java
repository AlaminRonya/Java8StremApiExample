package com.alamin.interviews.array;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        System.out.println(checkArmstrongNumber(134));
    }
    private static int countDigit(int n){
        if (n == 0){
            return 0;
        }
        return countDigit(n/10) + 1;
    }
    private static int power(int m, int n){
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product*m;
        }
        return product;
    }
    private static boolean checkArmstrongNumber(int n){
        int countDigit  = countDigit(n);
        int sum = 0;
        int temp = n;
        while (temp != 0){
            sum = sum+power(temp%10,countDigit);
            temp /= 10;
        }
        return sum == n;
    }
}
