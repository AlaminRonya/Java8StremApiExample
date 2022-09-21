package com.alamin.function_predicate;

import com.alamin.Employee;

import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPredicateFunctionalInterface {
    // TODO: 9/21/2022
    static BiPredicate<Employee, String> genderPredicate = (employee, gender) -> employee.getGender().equals(gender);
    static Function<List<Employee>, Map<Integer, Double>> nameAndSalary = employees -> employees.stream()
            .filter(e->genderPredicate.test(e, "MALE"))
            .collect(Collectors.toMap(Employee::getId, Employee::getSalary));

    public static void main(String[] args) {
        System.out.println(nameAndSalary.apply(Employee.employees));
    }
}
