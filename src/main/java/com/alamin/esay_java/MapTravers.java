package com.alamin.esay_java;

import java.util.*;

public class MapTravers {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,2,3,4,5,6,7,8,9,7,8,4,4,4,2,5};
        for (Integer num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }
        for(Integer key: map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(3, 30);
        treeMap.put(1, 10);
        treeMap.put(2, 20);
        System.out.println("---------------------");
        for(Integer key: treeMap.keySet()){
            System.out.println(key+"->"+treeMap.get(key));
        }
        System.out.println(treeMap);

        // Create a MaxHeap using PriorityQueue and a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the MaxHeap
        maxHeap.add(3);
        maxHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(5);

        // Poll elements from the MaxHeap (retrieve and remove the maximum element)
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
