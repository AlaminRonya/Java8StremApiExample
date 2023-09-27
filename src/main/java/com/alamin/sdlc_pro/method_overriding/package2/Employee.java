package com.alamin.sdlc_pro.method_overriding.package2;

import com.alamin.sdlc_pro.method_overriding.package1.Company;

public class Employee extends Company {
    @Override
    public void information() {
        System.out.println("Employee Information.....");
    }
}
