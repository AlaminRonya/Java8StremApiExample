package com.alamin.access_modifier.default_modifier;

public class ModifierMain {
    public static void main(String[] args) {
        Person person = new Person();
        // TODO: 5/12/2023 default modifier does not access the another package.
        System.out.println(person.value);
    }
}
