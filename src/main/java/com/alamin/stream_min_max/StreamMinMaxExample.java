package com.alamin.stream_min_max;

import com.alamin.Employee;

import java.util.Comparator;
import java.util.Optional;

public class StreamMinMaxExample {
    public static void main(String[] args) {
        Optional<Employee> minEmployee = Employee.employees.stream().min(Comparator.comparing(Employee::getSalary));
        Optional<Employee> maxEmployee = Employee.employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(minEmployee.get());
        System.out.println(maxEmployee.get());


    }
}
