package com.alamin.sdlc_pro.statics;

import com.alamin.sdlc_pro.statics.parent.Parent;

import static com.alamin.sdlc_pro.statics.parent.Parent.*;

public class Child {
    public static void main(String[] args) {

        // TODO: By using the class name
        System.out.println(Parent.value);

        // TODO: By using reference variable
        // TODO: Not throw the NotNullPointerException
        // TODO: parent variable convert this Class name. So, parent to Parent
        Parent parent = null; // or new Parent();
        System.out.println(parent.value);

        // TODO: Direct accessing
        System.out.println(value);
        System.out.println(getValue());
    }
}
