package com.alamin.sdlc_pro.modifiers;

import com.alamin.sdlc_pro.modifiers.default_modifier.DefaultModifier;
import com.alamin.sdlc_pro.modifiers.private_modifier.PrivateModifier;
import com.alamin.sdlc_pro.modifiers.public_modifier.PublicModifier;

public class MainApp{
    public static void main(String[] args) {
//        System.out.println(new PrivateModifier().value);
        System.out.println(new PrivateModifier().getValue());
        System.out.println(new PublicModifier().value);
    }
}
