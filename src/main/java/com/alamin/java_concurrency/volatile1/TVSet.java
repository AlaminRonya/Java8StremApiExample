package com.alamin.java_concurrency.volatile1;

public class TVSet {
    private static volatile TVSet tVSetInstance = null;

    private TVSet() {
        System.out.println("V");
    }
    public static TVSet getInstance(){
        if (tVSetInstance == null){
            synchronized (TVSet.class){
                if (tVSetInstance == null){ // double-checking
                    tVSetInstance = new TVSet();
                }
            }
        }
        return tVSetInstance;
    }
}
