package com.alamin.leetcode.array;

public class ReverseBit {

    public static void main(String[] args) {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        System.out.println(reverseBits(n));
    }
    private static char[] memo = new char[32];
    public static int reverseBits(int n) {
        char[] bits = Integer.toBinaryString(n).toCharArray();
        int length = bits.length;

        int index = memo.length - 1;
        int i = length - 1;
        while ( i >= 0){
            memo[index--] = bits[i];
            i--;
        }
        for (int j = 0; j < 32 - length; j++) {
            memo[j] = '0';
        }

        int start = 0;
        int end = memo.length - 1;
        while (start<end){
            char c = memo[start];
            memo[start] = memo[end];
            memo[end] = c;
            start++;
            end--;
        }

        return Integer.parseUnsignedInt(String.valueOf(memo), 2);
    }
}
