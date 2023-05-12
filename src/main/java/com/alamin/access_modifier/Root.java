package com.alamin.access_modifier;

import com.alamin.access_modifier.default_modifier.Person;
import com.alamin.access_modifier.protected_modifier.A;
import com.alamin.access_modifier.public_private.AppUser;

//public class Root extends A{
public class Root {
    public static void main(String[] args) {
        AppUser appUser = new AppUser("Alamin", "1234");
        System.out.println(appUser.getPassword());
        Person person = new Person();
        // TODO: 5/12/2023 default modifier does not access the another package.
//        System.out.println(person.value);

        // TODO: 5/12/2023 protected value is accessing another class.
//        System.out.println(new ProtectedModifier().value);
        System.out.println(new ProtectedModifier().getAnotherClassProtectedValue());

//        extended of A
//        System.out.println(new Root().value);
//        another package can not accessing Object this class.
//        System.out.println(new A().value);

//        System.out.println(new ProModi().value);
        new ProModi().m1();
        A ob = new ProModi();
//        System.out.println(ob.value);


    }
}
