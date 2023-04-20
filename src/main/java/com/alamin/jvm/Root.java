package com.alamin.jvm;
class VerifyResolve {
    public void show(){
        System.out.println("LinkageError: NoClassDefFoundError");
        System.out.println("Exception: ClassNotFoundException");
    }
}
public class Root {
    public static void main(String[] args) {
        System.out.println("Running of Root Class");
        // TODO: resolve point
        VerifyResolve resolve = new VerifyResolve();
        resolve.show();
    }
}
