package com.alamin.beecrowd;

import java.util.*;

public class ToCarryOrNotToCarry {
    public String name;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int s = a ^ b;
        System.out.println(s);

        // TODO:  Creating a HashSet Object
        Set<String> set = new HashSet<>();

        // TODO:  Adding New Element
        boolean java = set.add("JAVA"); // true
        boolean sdlcPro = set.add("SDLC_PRO"); // true
        boolean nul = set.add(null); // true
        System.out.println(nul);

        // TODO:  Adding Duplicate Element
        boolean duplicatedValue = set.add("JAVA"); // false

        System.out.println(java);
        System.out.println(sdlcPro);

        System.out.println(duplicatedValue);

    }
}
