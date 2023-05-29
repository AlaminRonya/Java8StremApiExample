package com.alamin.sdlc_pro;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Root {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        int n = (nums.length%k !=0)?(nums.length/k)+1: (nums.length/k);
        int[][] result = new int[n][k];
        int i = 0;
        int resultI = 0;

        while (i < nums.length){
            int j = i;
            int indexI = 0;
            while (j < k+i && j < nums.length){
                System.out.print(nums[j] +",");
               result[resultI][indexI] = nums[j];
               indexI++;
                j++;
            }

            resultI++;
            System.out.println();
            i+=k;
        }
        System.out.println("********");
        System.out.print("[");
        for (int x = 0; x < result.length; x++){
            System.out.print("[");
            for (int j = 0; j < result[x].length; j++){
                System.out.print(result[x][j]);
                if (j != result[x].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if (x != result.length-1){
                System.out.print(",");
            }

        }
        System.out.print("]");
    }
}
