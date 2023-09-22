package com.alamin.esay_java;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicated {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
    }
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num: nums){
            if (map.containsKey(num)){
                return num;
            }
            map.put(num, 1);
        }
        return Integer.MIN_VALUE;
    }

}
