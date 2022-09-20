package com.alamin.consumer_predicate;

import com.alamin.Employee;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ConsumerAndPredicateFunctionalInterface {

    static BiPredicate<Employee, String> genderPredicate = (employee, gender) -> employee.getGender().equals(gender);
//    static BiPredicate<Employee, Double> salaryGreaterThanByEmployee = (emp, salary) -> genderPredicate.test(emp,"MALE") && emp.getSalary() > salary;
    static BiPredicate<Employee, Double> salaryGreaterThanByEmployee = (emp, salary) -> emp.getSalary() > salary;

    public static void main(String[] args) {
        Employee.employees.stream().filter(employee -> salaryGreaterThanByEmployee.test(
                employee, 20000.0)
                && genderPredicate.test(employee, "MALE")
        ).forEach(System.out::println);

    }
}
