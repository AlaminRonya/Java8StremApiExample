package com.alamin.sdlc_pro.abstracts;

/**
 * Modifier not used public final abstract class
 * Explicitly abstract class extends Object-class
 * Abstract class by default public
 */
abstract class Wish extends Object{ // 100% Abstract Class
    public Wish() {
        super();
    }
    public abstract void land();
    public abstract void house();
    public abstract void building();
    public abstract void car();
}
abstract class Grandfather extends Wish{ // 75% Abstract Class

    public Grandfather() {
        this(10);
    }
    public Grandfather(int a) {
        super();
    }

    @Override
    public void land() {
        System.out.println("Grandfather purchases 1 big-ha land.");
    }
    public abstract void house();
    public abstract void building();
    public abstract void car();
}
abstract class Father extends Grandfather{ // 50% Abstract Class
    @Override
    public void house() {
        System.out.println("Father makes a house.");
    }
    public abstract void building();
    public abstract void car();
}
abstract class Child extends Father{ // 25% Abstract Class
    @Override
    public void building() {
        System.out.println("Child makes a building.");
    }
    public abstract void car();
}
abstract class Son extends Child{ // 0% Abstract Class
    @Override
    public void car() {
        System.out.println("Son buys a car.");
    }
}
public class AbstractClass_0_100 {
    public static void main(String[] args) {
        var grandfather = new Grandfather(){
            @Override
            public void house() {}
            @Override
            public void building() {}
            @Override
            public void car() {}
        };
        System.out.println(".....GrandFather.....");
        grandfather.land();

        var father = new Father(){
            @Override
            public void building() {}
            @Override
            public void car() {}
        };
        System.out.println(".....Father.....");
        father.land();
        father.house();

        var child = new Child(){
            @Override
            public void car() {}
        };
        System.out.println(".....Child.....");
        child.land();
        child.house();
        child.building();
        var son = new Son(){};
        System.out.println(".....Son.....");
        son.land();
        son.house();
        son.building();
        son.car();
    }
}
