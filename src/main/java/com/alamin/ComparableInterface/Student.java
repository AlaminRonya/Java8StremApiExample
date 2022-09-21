package com.alamin.ComparableInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student>{

    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.age > o.age ? 1 : this.age < o.age ? -1 : 0;
    }
}
