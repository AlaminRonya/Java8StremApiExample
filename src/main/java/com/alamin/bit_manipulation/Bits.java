package com.alamin.bit_manipulation;

public class Bits {
    public static void main(String[] args) {
//        getBitOfPosition(5, 2);
//        setBitOfPosition(5, 4);

        Integer a = 10;
        System.out.println("a==>"+a);
        increament(a);
        System.out.println("a==>"+a);
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
}
