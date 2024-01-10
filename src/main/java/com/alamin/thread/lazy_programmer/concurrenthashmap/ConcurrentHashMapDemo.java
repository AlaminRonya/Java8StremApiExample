package com.alamin.thread.lazy_programmer.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        // Adding elements to the ConcurrentHashMap
        concurrentHashMap.put("A",1);
        concurrentHashMap.put("B",2);
        concurrentHashMap.put("C",3);
        // Displaying the initial map
        System.out.println("Initial ConcurrentHashMap: "+concurrentHashMap);

        // Updating an elements
        concurrentHashMap.put("B", concurrentHashMap.get("B")+10);
        // Displaying the initial map
        System.out.println("ConcurrentHashMap alter update: "+concurrentHashMap);

    }
}
