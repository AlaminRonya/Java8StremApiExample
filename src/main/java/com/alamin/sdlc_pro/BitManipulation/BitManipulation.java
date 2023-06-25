package com.alamin.sdlc_pro.BitManipulation;

public class BitManipulation {
    /*
        | = or
        & = and
        ~ = not
        ^ = xor
        << = left-shift
        >> = right-shift
        >>> = unsigned right-shift

        num | ( 1<<n ) = Bit set
        num & ~( 1<<n ) = Bit clear
        num ^ ( 1<<n ) = Bit Toggle
     */

    public static void main(String[] args) {
        int num = 144;
        String string = Integer.toBinaryString(num);
        System.out.println("144 of bit: "+string);
        System.out.println("Count of 1 bit for num: "+Integer.bitCount(num));
        System.out.println("LSB: "+Integer.lowestOneBit(num));
        System.out.println("LSB: "+(num & -num));
        System.out.println("MSB: "+Integer.highestOneBit(num));
        System.out.println("LSB clear: "+Integer.toBinaryString(num & (num-1)));


    }
}
