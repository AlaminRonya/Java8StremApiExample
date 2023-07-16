package com.alamin.oops.encapsulation;
// TODO: Not Tightly Encapsulation Class:
class Person{
    private int id;
    public String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
// TODO: Tightly Encapsulation Class:
//  All property is private and provides the getter and setter.
class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student(1, "Al Amin");
        System.out.println("Id: "+student.getId()+"\nName: "+student.getName());
        Person person = new Person(1, "Rony");
        System.out.println("Id: "+person.getId()+"\nName: "+person.name);
    }
}
