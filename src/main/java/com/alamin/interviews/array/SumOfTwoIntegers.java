package com.alamin.interviews.array;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(5,6));
    }
    public static int getSum(int a, int b) {
        while(b != 0){
            System.out.println("b: "+b);
            System.out.println(Integer.toBinaryString(a)+"\n"+Integer.toBinaryString(b));
            int carry = (a & b) << 1;
            System.out.println("carry: "+carry);
            a = a ^ b;
            System.out.println("a: "+a);
            b = carry;
        }
        return a;
    }
}
