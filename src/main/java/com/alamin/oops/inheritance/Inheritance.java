package com.alamin.oops.inheritance;
class Person{
    protected String name = "Person.class";
    public Person(String name) {
        this.name = name;
    }
}
class Student extends Person{
    protected String name = "Student.class";
    public Student() {
        // not use super()
        this("Constructor chaining");
    }

    public Student(String name) {
        super(name);
    }


}
public class Inheritance {
    public static void main(String[] args) {
        Person obj = new Student();
        // TODO: Compiler regulation
        System.out.println(obj.name);
        // TODO: Runtime regulation
        System.out.println(((Student)obj).name);

    }
}
