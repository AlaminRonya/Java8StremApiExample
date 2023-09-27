package com.alamin.sdlc_pro.method_overriding;

import com.alamin.sdlc_pro.method_overriding.package1.Company;
import com.alamin.sdlc_pro.method_overriding.package1.InfoClass;
import com.alamin.sdlc_pro.method_overriding.package1.Varsity;
import com.alamin.sdlc_pro.method_overriding.package2.Student;

public class AppModifierOverriding {
    public static void main(String[] args) {
        /**
         *  InfoClass infoClass = new Varsity();
         *  nfoClass.information();
         *  Compilation Error Because InfoClass is information() method
         *  modifier <<default>> that's not view the another packages
         */
        Varsity student = new Student();
        student.information();
    }
}
