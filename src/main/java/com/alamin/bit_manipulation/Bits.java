package com.alamin.bit_manipulation;

public class Bits {
    public static void main(String[] args) {
//        getBitOfPosition(5, 2);
//        setBitOfPosition(5, 4);

        Integer a = 10;
        System.out.println("a==>"+a);
        increament(a);
        System.out.println("a==>"+a);

        // Setting a specific bit at a given position
        int num = 7; // 00000111 in binary
        int position = 3;
        int setBitNum = num | (1 << position);
        System.out.println("After setting bit at position " + position + ": " + setBitNum);

        // Clearing a specific bit at a given position
        int clearBitNum = num & ~(1 << position);
        System.out.println("After clearing bit at position " + position + ": " + clearBitNum);

        // Toggling a specific bit at a given position
        int toggleBitNum = num ^ (1 << position);
        System.out.println("After toggling bit at position " + position + ": " + toggleBitNum);

        // Checking if a specific bit is set
        int bitCheckPosition = 2;
        boolean isBitSet = (num & (1 << bitCheckPosition)) != 0;
        System.out.println("Bit at position " + bitCheckPosition + " is set: " + isBitSet);

        // Counting set bits (number of 1s) in a number
        int countSetBits = 0;
        int numToCount = 12; // 00001100 in binary
        while (numToCount > 0) {
            countSetBits += numToCount & 1;
            numToCount >>= 1;
        }
        System.out.println("Number of set bits: " + countSetBits);

        int x = 4;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = -5;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }

    private static void increament(Integer a){
        ++a;
        System.out.println("a==>"+a);

    }

    private static void getBitOfPosition(int num, int position){

        // 0 1 0 1 0 1 <==bit
        // 5 4 3 2 1 0 <== position of number
        int bitMask = 1<<position;
        if ((num & bitMask) == 0){
            System.out.println("Bit is zero.");
        }else {
            System.out.println("Bit is one");
        }
    }

    private static void setBitOfPosition(int num, int position){

        // 0 1 0 1 0 1 <==bit
        // 5 4 3 2 1 0 <== position of number
        int bitMask = 1<<position;
        int newNumber = num | bitMask;
        System.out.println(newNumber);

    }
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }

}
