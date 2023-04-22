package com.alamin.hashmap_immutable_obj;

import java.util.HashMap;

public class Root {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student student = new Student("Alamin");
        map.put(student, "Bangladesh");
//        hashMap.put(student, "Bangla");
        System.out.println(map.get(student));
    }
}
