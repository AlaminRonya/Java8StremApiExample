package com.alamin.map_work;

import java.util.HashMap;
import java.util.HashSet;

public class BugCode {
    public static void main(String[] args) {
        String bug1 = new String("FB");
        String bug2 = new String("Ea");
        String bug3 = new String("SDLC PRO");
        String bug4 = new String("SDLC PRO");
        System.out.println((bug1.hashCode() == bug2.hashCode())
                +" : "+(bug3.hashCode() == bug4.hashCode())
                +" : "+(bug2.hashCode() == bug4.hashCode()));

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(bug1);
        System.out.println(hashSet);
        hashSet.add(bug2);
        System.out.println(hashSet);
        hashSet.add(bug2);
        hashSet.add(bug3);
        System.out.println(hashSet);


        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put(bug1, 10);
        System.out.println(hashMap);
        hashMap.put(bug2, 20);
        System.out.println(hashMap);
        hashMap.put(bug3, 30);
        hashMap.put(bug4, 20);

        System.out.println(hashMap);
    }
}
