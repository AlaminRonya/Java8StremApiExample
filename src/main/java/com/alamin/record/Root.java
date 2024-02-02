package com.alamin.record;

import java.io.*;

public class Root {
    private static final String PATH = "file/student.ser";

    public static void main(String[] args) {
        StudentRecord studentRecord = new StudentRecord(101, "Alamin", -3.71f);
//        StudentRecord studentRecord1 = new StudentRecord(101, "Alamin", 3.71f);
//        serialize(studentRecord);
        System.out.println(deserialize());
    }
    private static void serialize(Object object){
        try(
                FileOutputStream fos = new FileOutputStream(PATH);
                ObjectOutputStream out = new ObjectOutputStream(fos)
                ) {
            out.writeObject(object);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static Object deserialize(){
        try(
                FileInputStream fis = new FileInputStream(PATH);
                ObjectInputStream in = new ObjectInputStream(fis)
                ) {
            return in.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
