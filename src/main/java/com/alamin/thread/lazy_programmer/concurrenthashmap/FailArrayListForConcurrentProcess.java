package com.alamin.thread.lazy_programmer.concurrenthashmap;

import java.util.ArrayList;
import java.util.List;

public class FailArrayListForConcurrentProcess {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        for (Integer num: nums){
            System.out.println(num);
            if (num == 2){
                nums.add(3);
            }
        }
        System.out.println(nums);
    }
}
