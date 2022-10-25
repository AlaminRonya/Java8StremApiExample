package com.alamin.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String[] args) {
        System.out.println(~6);
        int a = 1;
        List<Integer> sequence = new ArrayList<>();

        int searchFor = 0;
        int counter = 0;
        for (int i = 0; i < Integer.BYTES*8 ; i++){
            if ((a & 1) != searchFor){
                sequence.add(counter);
                searchFor = a & 1;
                counter = 0;
            }
            counter++;
            a >>>= 1;
        }
        sequence.add(counter);
        System.out.println(sequence);
        System.out.println(Integer.BYTES*8);
        System.out.println(printBinary(0.25));
    }

    static String printBinary(double num){
        if (num >= 1 || num <= 0){
            return "error";
        }
        StringBuilder binary = new StringBuilder();
        binary.append('.');
        while (num > 0){
            if (binary.length() >= 32){
                return "error";
            }
            double r = num*2;
            if (r >= 1){
                binary.append(1);
                num = r-1;
            }else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }
}
