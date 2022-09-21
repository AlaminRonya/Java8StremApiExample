package com.alamin.supplier;

import com.alamin.Employee;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    static Supplier<List<Employee>> allEmployee = ()-> Employee.employees.isEmpty() ? null : Employee.employees;
    static Consumer<List<Employee>> show = employees -> employees.forEach(e-> System.out.println(e.getName()+" : "+ e.getSalary()));
    public static void main(String[] args) {
        show.accept(allEmployee.get());
    }
}
