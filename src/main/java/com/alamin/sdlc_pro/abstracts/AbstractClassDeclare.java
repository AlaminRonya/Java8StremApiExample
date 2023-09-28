package com.alamin.sdlc_pro.abstracts;

abstract class AbstractClassDeclare {
    /**
     * Not create object for abstract class
     * Create of anonymous inner class
     * At a time not use final and abstract keyword (final abstract)
     * Not declared public abstract static void sh();
     * Not declared private abstract  void sh();;
     */
    private int v = 10;
    private static int ps = 20;
    private static final int psf = 30;
    int df = 10;
    static int dfs = 10;
    static final int dfsf = 10;
    protected int proV = 10;
    protected static int proSV = 10;
    protected static final int proSFV = 10;
    public int pb = 10;
    public static int pbs = 10;
    public static final int pbsf = 10;

    static {
        // Static block
    }
    {
        // Instance Block
    }

    public AbstractClassDeclare() {
    }
    public AbstractClassDeclare(int v, int pb) {
        this.v = v;
        this.pb = pb;
    }
    abstract void sh();
    protected abstract void sh1();
    public abstract void sh2();

    // getter & setter
}
