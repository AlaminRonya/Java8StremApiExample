package com.alamin.ComparableInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Al Amin", 24),
                new Student("Saima", 23),
                new Student("Jahangir", 24),
                new Student("Manik", 25),
                new Student("Akash", 15),
                new Student("Pritha", 19),
                new Student("Akhi", 20),
                new Student("Salman", 28),
                new Student("Rony", 50),
                new Student("Al Amin", 24),
                new Student("Al Amin", 24),
                new Student("Al Amin", 24),
                new Student("Al Amin", 24),
                new Student("Al Amin", 24)
        ));
//        System.out.println(students);
//        Collections.sort(students);
//        System.out.println(students);
        students.sort(new NameComparator());
        System.out.println(students);

        students.sort(new AgeComparator().reversed());
        System.out.println(students);
    }
}
