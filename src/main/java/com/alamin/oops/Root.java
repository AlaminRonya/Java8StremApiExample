package com.alamin.oops;

public class Root {
    public static void main(String[] args) {
        Address address = new Address("Dhaka", "Bangladesh");
        System.out.println("Address hashcode: "+address.hashCode());
        Student student = new Student(1,"Al Amin", address);
        System.out.println(student);
        Address address1 = student.getAddress();
        System.out.println("Address1 hashcode: "+address1.hashCode());
        address1.setCity("Pabna");
        System.out.println(student);
    }
}
