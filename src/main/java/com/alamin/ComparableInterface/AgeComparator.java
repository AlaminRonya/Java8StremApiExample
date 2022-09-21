package com.alamin.ComparableInterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
