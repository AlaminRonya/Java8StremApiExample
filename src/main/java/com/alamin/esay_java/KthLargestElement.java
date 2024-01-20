package com.alamin.esay_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 2, 5};
        int k = 3;
        Arrays.sort(nums);
        System.out.println(kthLargestElement(nums, k));
        System.out.println(kthSmallestElement(nums, k));
    }
    private static Integer kthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer n: arr){
            maxHeap.add(n);
        }
        int i = 1;
        while (i < k){
            maxHeap.poll();
            i++;
        }
        return maxHeap.poll();
    }
    private static Integer kthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (Integer n: arr){
            maxHeap.add(n);
        }
        int i = 1;
        while (i < k){
            maxHeap.poll();
            i++;
        }
        return maxHeap.poll();
    }
}
