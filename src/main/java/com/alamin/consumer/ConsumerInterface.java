package com.alamin.consumer;

import com.alamin.Employee;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerInterface {

    // TODO: Consumer<T> is input value but not return value (i.e print)
    // TODO: When using andThen, must be type same

    static Consumer<String> toUpperCase = s-> System.out.println(s.toUpperCase());
    static Consumer<String> toLowerCase = s-> System.out.println(s.toLowerCase());

    static Predicate<Employee> salaryRange = employee -> employee.getSalary()>15000;

    static Consumer<List<Employee>> allEmp = System.out::println;
    static Consumer<List<Employee>> empName = emp -> emp.forEach(e-> System.out.println(e.getName()));
    static Consumer<List<Employee>> empAddress = emp -> emp.forEach(e-> System.out.println(e.getAddress().toUpperCase()));
    static Consumer<List<Employee>> empSalaryRange = emp -> emp.stream().filter(salaryRange).forEach(System.out::println);
    public static void main(String[] args) {
        toUpperCase.accept("Java Programmer");
        toLowerCase.accept("Java Programmer");
        toUpperCase.andThen(toLowerCase).accept("Hi, I'm spring & spring-boot developer.");

        System.out.println("=================Individual ====================");
        allEmp.accept(Employee.employees);
        empName.accept(Employee.employees);
        empAddress.accept(Employee.employees);
        empSalaryRange.accept(Employee.employees);
        System.out.println("=================Combine all method======================");
        allEmp.andThen(empName).andThen(empAddress).andThen(empSalaryRange).accept(Employee.employees);

    }
}
