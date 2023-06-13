package com.alamin.sdlc_pro.modifiers.protected_modifier.package2;

import com.alamin.sdlc_pro.modifiers.protected_modifier.package1.Package1Class;

public class Package1ClassExtends extends Package1Class {
//    public int getValue(){
//        return new Package1Class().value;
//    }

    public int getValue(){
        return value;
    }
    public int getValueObj(){
        return new Package1ClassExtends().value;
    }

}
