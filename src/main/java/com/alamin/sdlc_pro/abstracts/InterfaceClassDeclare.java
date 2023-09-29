package com.alamin.sdlc_pro.abstracts;

public interface InterfaceClassDeclare  {
    /**
     * Not Declared for Interface
     *
     * Interface methods by default public abstract
     * Interface properties by default public static final
     * Explicitly interface can not extend Object-class but implicitly extends Object-class
     * Modifier not used public final interface
     * private int v = 10;
     * private static int ps = 20;
     * private static final int psf = 30;
     * static {
     *      Not static block explicitly declare the interface
     *      static block works implicitly provide compiler for object types
     *  }
     *  {
     *    // Not declare Instance Block here the interface
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
