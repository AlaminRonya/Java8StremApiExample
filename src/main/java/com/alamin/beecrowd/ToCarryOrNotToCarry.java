package com.alamin.beecrowd;

import java.util.*;

public class ToCarryOrNotToCarry {
    public String name;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        int s = a ^ b;
//        System.out.println(s);
//
//        // TODO:  Creating a HashSet Object
//        Set<String> set = new HashSet<>();
//
//        // TODO:  Adding New Element
//        boolean java = set.add("JAVA"); // true
//        boolean sdlcPro = set.add("SDLC_PRO"); // true
//        boolean nul = set.add(null); // true
//        System.out.println(nul);
//
//        // TODO:  Adding Duplicate Element
//        boolean duplicatedValue = set.add("JAVA"); // false
//
//        System.out.println(java);
//        System.out.println(sdlcPro);
//
//        System.out.println(duplicatedValue);
//
//        int n = 45;
//        String n1 = "45";
        char[] chars = Integer.toBinaryString(2).toCharArray();

        int[] arr = new int[chars.length];
        for (int i = 0; i < arr.length; i++) {
            int parseInt = Integer.parseInt(String.valueOf(chars[i]));
            arr[i] = parseInt;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(chars));
    }
}

