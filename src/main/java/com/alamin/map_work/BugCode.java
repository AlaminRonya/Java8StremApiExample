package com.alamin.map_work;

public class BugCode {
    public static void main(String[] args) {
        String bug1 = new String("FB");
        String bug2 = new String("Ea");
        String bug3 = new String("SDLC PRO");
        String bug4 = new String("SDLC PRO");
        System.out.println((bug1.hashCode() == bug2.hashCode())
                +" : "+(bug3.hashCode() == bug4.hashCode())
                +" : "+(bug2.hashCode() == bug4.hashCode()));
    }
}
