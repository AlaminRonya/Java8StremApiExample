package com.alamin.sdlc_pro.method_overriding;
class Company{
    public static void companyName(){
        System.out.println("Company name-1");
    }
    public static void address(){
        System.out.println("Company Location: Dhaka");
    }
}
class Company1 extends Company{
    public static void address(){
        System.out.println("Company Location: Pabna");
    }
}
public class StaticMethodNotOverrideButHiding {
    public static void main(String[] args) {
        Company company = new Company1(); // or Company company = null; depend on Object type
        company.companyName();
        company.address();
        System.out.println("***************");
        Company1 company1 = new Company1(); // or Company1 company1 = null; depend on Object type and hiding the address() method for parent-class
        company1.companyName();
        company1.address();

    }
}
