package com.alamin.oops.reflactions;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cat{
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void meow(){
        System.out.println("Meow");
    }
    private void heyThisIsPrivate(){
        System.out.println("How did you call this??");
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println("I'm public and static!");
    }
    private static void thisIsPrivateStaticMethod(){
        System.out.println("I'm private and static!");
    }
}
public class Root {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cat = new Cat("Stella", 14);
        Field[] catFields = cat.getClass().getDeclaredFields();
        for (Field f: catFields){
//            System.out.println(f.getName());
            if (f.getName().equals("name")){
                f.setAccessible(true);
                f.set(cat,"Meow");
            }
        }
        Method[] catMethods = cat.getClass().getDeclaredMethods();
        for (Method method: catMethods){
//            System.out.println(method.getName());
            if (method.getName().equals("meow")){
                method.invoke(cat);
            }
            if (method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(cat);
            }
            if (method.getName().equals("thisIsPublicStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
            if (method.getName().equals("thisIsPrivateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
//        System.out.println("Cat name: " +cat.getName());
    }
}
