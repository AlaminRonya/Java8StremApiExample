package com.alamin.sdlc_pro.abstracts;

public interface InterfaceClassDeclare  {
    /**
     * Not Declared for Interface
     *
     * Explicitly interface not extends Object-class
     * Modifier not used public final interface
     * private int v = 10;
     * private static int ps = 20;
     * private static final int psf = 30;
     * static {
     *     // Static block
     *  }
     *  {
     *    // Instance Block
     *  }
     *  public InterfaceClassDeclare(){}
     *  private static final void method1(){}
     *  public void method1(){}
     *
     */

    int propertyAutomaticPublicStaticFinal = 10;
    private void method(){}
    private static void staticMethod(){}
    default void overrideOrNotOverrideMethod(){}
    void methodAutomaticPublic();


}
