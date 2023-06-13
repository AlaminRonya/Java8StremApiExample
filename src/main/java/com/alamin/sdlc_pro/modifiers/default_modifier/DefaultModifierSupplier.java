package com.alamin.sdlc_pro.modifiers.default_modifier;

public class DefaultModifierSupplier extends DefaultModifier {
    public int getDefaultModifierValueOtherPackageObj(){
        return new DefaultModifier().value;
    }

    public int getDefaultModifierValueOtherPackage(){
        return value;
    }
}
