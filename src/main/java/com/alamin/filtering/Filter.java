package com.alamin.filtering;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
@ToString
class Student{
    private String id;
    private String name;
    private double bangla;
    private double english;
    private double math;
}
public class Filter {
    static double minMark = 80;
    static double maxMark = 100;
    static Predicate<Student> betweenToMarks = student -> student.getBangla() >= minMark && student.getBangla()<= maxMark && student.getEnglish()>= minMark && student.getEnglish()<= maxMark && student.getMath()>= minMark && student.getMath()<= maxMark;
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,80),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,50),
                new Student("CSE 065", "Alamin", 80,90,40),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,95),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,70),
                new Student("CSE 065", "Alamin", 80,90,39),
                new Student("CSE 065", "Alamin", 80,39,70),
                new Student("CSE 065", "Alamin", 20,90,70),
                new Student("CSE 065", "Alamin", 80,10,70),
                new Student("CSE 065", "Alamin", 80,90,30)

        );
        students.stream().filter(betweenToMarks).forEach(System.out::println);
    }
}
