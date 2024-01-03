package com.alamin.collections_framework;

import java.util.stream.IntStream;

public class Root {
    public static void main(String[] args) {
        IntStream.range(1,11).map(p->p*2).forEach(value -> {
            System.out.println(Thread.currentThread().getName()+" : "+value);
        });
        System.out.println("******* Parallel Thread is working *********");
        IntStream.range(1,20)
                .parallel()
                .map(p->p*2)
                .forEach(value -> {
            System.out.println(Thread.currentThread().getName()+" : "+value);
        });
    }
}
