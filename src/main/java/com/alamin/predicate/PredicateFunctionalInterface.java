package com.alamin.predicate;

import com.alamin.Employee;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    // TODO: Predicate<T> :) return the boolean value

    static Predicate<Integer> lessThan = v -> v < 50;
    static Predicate<Integer> greaterThan = v -> v > 50;
    static Predicate<Integer> equalTo = v -> v == 50;

    static Predicate<Employee> maleEmployee =  employee -> employee.getGender().equals("MALE");
    static BiPredicate<String, Employee> genderEmployee =  (gender, employee) -> employee.getGender().equals(gender);

    public static void main(String[] args) {
        System.out.println(lessThan.test(10));
        System.out.println(greaterThan.test(10));
        System.out.println(equalTo.test(50));
        System.out.println(lessThan.or(equalTo).test(50));
        System.out.println(lessThan.or(equalTo).negate().test(50)); // return !true;
        System.out.println(greaterThan.or(equalTo).test(50));
        System.out.println(greaterThan.and(lessThan).and(equalTo).test(50));

        System.out.println("======================");
        Employee.employees.stream().filter(emp -> maleEmployee.test(emp)).forEach(System.out::println);
        System.out.println("======================");
        Employee.employees.stream().filter(employee -> genderEmployee.test("FEMALE", employee)).forEach(System.out::println);


    }
}
