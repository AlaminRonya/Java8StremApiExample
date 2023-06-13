package com.alamin.sdlc_pro.modifiers.protected_modifier;

import com.alamin.sdlc_pro.modifiers.protected_modifier.package1.Package1Class;
import com.alamin.sdlc_pro.modifiers.protected_modifier.package2.Package1ClassExtends;

public class MainApp {
    public static void main(String[] args) {
        // TODO: 6/13/2023 protected modifier is accessing
        Package1ClassExtends package1ClassExtends = new Package1ClassExtends();
//        System.out.println(package1ClassExtends.value);
        System.out.println(package1ClassExtends.getValue());
        // TODO: 6/13/2023 protected modifier is accessing
        Package1Class package1Class = new Package1Class();
//        System.out.println(package1Class.value);


    }
}
