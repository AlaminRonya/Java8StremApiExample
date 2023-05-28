package com.alamin.sdlc_pro.marker_interface;

import java.io.*;
class Person{
    private int nid;
    private String nationality;

    public Person() {
        System.out.println("Person init.........");
    }

    public Person(int nid, String nationality) {
        this.nid = nid;
        this.nationality = nationality;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nid=" + nid +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

// TODO: 5/28/2023 jokhon kono Serializable another nonSerializable k extend kore thake deSerializable korar somo parent class er contructor call hoi se jnno tar default dite hoi
class Student extends Person implements Serializable {
    public static final long serialVersionUID = 1000L;
    private int id;
    private String name;
    private float cgpa;
    private transient String password;
    // TODO: 5/28/2023 transient er kaj kono file save jeno na kore ba store hok

    public Student(int nid, String nationality, int id, String name, float cgpa, String password) {
        super(nid, nationality);
        System.out.println("init..........");
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.password = password;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", password='" + password + '\'' +
                '}';
    }
}
public class InterfaceSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // TODO: 5/28/2023 Serializable

        /*
        Student student = new Student(1234578, "Bangladeshi", 1, "Alamin", 3.71f, "123456");
        System.out.println(student);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file/student.ser"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
*/


        // TODO: 5/28/2023 Deserializable and not object create only call toString() method any serializable implementation class always serialVersionUID by default provide kore thake


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file/student.ser"));
        Student student1 = (Student) objectInputStream.readObject();
        student1.setCgpa(3.99f);
        System.out.println(student1);






    }
}
