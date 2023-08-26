package com.alamin.sdlc_pro.pattern;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Rectangle Shape");
        rectangleShape(n);
        System.out.println("Triangle Shape");
        triangleShape(n);
        System.out.println("Triangle Bottom Down Shape");
        triangleBottomDownShape(n);
        System.out.println("Triangle Right Shape");
        triangleRightShape(n);
        System.out.println("Triangle Right Down Shape");
        triangleRightDownShape(n);
    }
    private static void rectangleShape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void triangleShape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void triangleBottomDownShape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void triangleRightShape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void triangleRightDownShape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
