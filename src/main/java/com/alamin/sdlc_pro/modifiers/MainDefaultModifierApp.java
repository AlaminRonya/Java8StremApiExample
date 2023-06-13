package com.alamin.sdlc_pro.modifiers;

import com.alamin.sdlc_pro.modifiers.default_modifier.DefaultModifier;
import com.alamin.sdlc_pro.modifiers.default_modifier.DefaultModifierSupplier;

public class MainDefaultModifierApp extends DefaultModifier {
    public static void main(String[] args) {
        // TODO: 6/13/2023 not access this default modifier property in another package level
//        System.out.println(new DefaultModifier().value);
//        System.out.println(value);
        System.out.println(new DefaultModifierSupplier().getDefaultModifierValueOtherPackage());
        System.out.println(new DefaultModifierSupplier().getDefaultModifierValueOtherPackageObj());
    }
}
