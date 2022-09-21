package com.alamin.stream_sort;

import com.alamin.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;

public class EmployeeSorting {
    static BiPredicate<String, Employee> genderEmployee =  (gender, employee) -> employee.getGender().equals(gender);
    public static void main(String[] args) {
        List<Employee> femaleEmployee = Employee.employees.stream()
                .filter(employee -> genderEmployee.test("FEMALE", employee))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(femaleEmployee);
    }
}
