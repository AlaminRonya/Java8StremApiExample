package com.alamin.interviews.bit_maipulation;

public class ReverseBit {
    public static void main(String[] args) {
        System.out.println(reverseBit(0));
        System.out.println(reverseBitRecursive(0, 31, 0, 0));
    }
    private static int reverseBit(int n){
        int leftIndex = 31, rightIndex = 0;
        int rev = 0;
        while (leftIndex > rightIndex){
            if ((n & (1<<leftIndex)) != 0){
                rev = rev | (1<<rightIndex);
            }
            if ((n & (1 << rightIndex)) != 0){
                rev = rev | (1<<leftIndex);
            }
            leftIndex--;
            rightIndex++;
        }
        return rev;
    }

    private static int reverseBitRecursive(int n, int leftIndex, int rightIndex, int rev){
        if (leftIndex < rightIndex){
            return rev;
        }
        if ((n & (1<<leftIndex)) != 0){
            rev = rev | (1<<rightIndex);
        }
        if ((n & (1 << rightIndex)) != 0){
            rev = rev | (1<<leftIndex);
        }
        return reverseBitRecursive(n, --leftIndex, ++rightIndex, rev);
    }

}
