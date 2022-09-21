package com.alamin.stream_reduce;

import com.alamin.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceExample {
    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
    public static void main(String[] args) {
        Integer reduce = numbers.stream().reduce(1, (a, b) -> a * b);
        Integer sumReduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        System.out.println(sumReduce);

        String allEmployeeNamesJoinComa = Employee.employees.stream().map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println(allEmployeeNamesJoinComa);

        String allEmployeeNames = Employee.employees.stream().map(Employee::getName)
                        .reduce("",String::concat);
        System.out.println(allEmployeeNames);




    }
}
