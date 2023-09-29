package com.alamin.sdlc_pro.interfaces;


import java.io.*;


class Person implements Serializable {

    private int nid;
    private String nationality;
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
public class SerializableInterface {
    public static void main(String[] args) {

//        writeObject();

        readObject();

    }

    private static void writeObject(){
        try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream("file/student.ser"))) {
            Person[] people = {new Person(1, "Bangladeshi"), new Person(2, "Bangladeshi"), new Person(3, "Bangladeshi")};
            fs.writeObject(people);
            fs.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void readObject(){
        try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream("file/student.ser"))) {
            Person[] people = (Person[]) fs.readObject();
            fs.close();
            for (Person person : people){
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
