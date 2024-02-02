package com.alamin.record;

import java.io.Serializable;
import java.util.Objects;

//public final class StudentClass extends java.lang.Record{
public final class StudentClass implements Serializable {
    private final int id;
    private final String name;
    private final float cgpa;

    public StudentClass(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public float cgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return id == that.id && Float.compare(that.cgpa, cgpa) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cgpa);
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
