package com.alamin.sdlc_pro.method_overriding;
class Company{
    public static void companyName(){
        System.out.println("Company name: SDLC_PRO");
    }
    public static void address(){
        System.out.println("Company Location: Dhaka");
    }
}
class Branch extends Company{
    public static void address(){
        System.out.println("Branch Location: Pabna");
    }
}
public class StaticMethodNotOverrideButHiding {
    public static void main(String[] args) {
        Company company = new Branch(); // or Company company = null; depend on Object type
        company.companyName();
        company.address();
        System.out.println("***************");
        Branch branch = new Branch(); // or Company1 company1 = null; depend on Object type and hiding the address() method for parent-class
        branch.companyName();
        branch.address();

    }
}
