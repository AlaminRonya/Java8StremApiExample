package com.alamin.function;

import java.util.function.Function;

public class FunctionFunctionalInterface {
    // TODO: Function<T, R> ===> return of value

    static Function<String, String> f1 = String::toUpperCase;
    static Function<String, String> f2 = name -> name.toLowerCase().concat(" features");

    public static void main(String[] args) {
        System.out.println(f1.apply("Java"));
        System.out.println(f2.apply("Python"));

        //f1-->first execute and return the value than f2-->second execute and finally return the value
        System.out.println(f1.andThen(f2).apply("Java"));
        //f2-->first execute and return the value than f1-->second execute and finally return the value
        System.out.println(f1.compose(f2).apply("JavaScript"));
    }
}
