package com.alamin.access_modifier;

import com.alamin.access_modifier.protected_modifier.A;

public class ProtectedModifier extends A {
    public int getAnotherClassProtectedValue(){
         return value;
    }
    public int getAnotherClassProtectedValueObj(){
        return new ProtectedModifier().value;
    }
}
