package com.alamin.BiConsumer;

import com.alamin.Employee;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunction {
    // TODO: BiConsumer used to two parameters, but not return the value

    static BiConsumer<Integer, Integer> add = (a,b)-> System.out.println("Sum: "+(a+b));
    static BiConsumer<Integer, Integer> sub = (a,b)-> System.out.println("Sub: "+(a-b));
    static BiConsumer<Integer, Integer> mult = (a,b)-> System.out.println("Mult: "+(a*b));
    static BiConsumer<Integer, Integer> div = (a,b)-> System.out.println("Div: "+((b != 0) ? a/b : Integer.MIN_VALUE));

    static BiConsumer<String, List<String>> empNameAndJoiningDate = (t,u)-> System.out.println(t+":)"+u);

    public static void main(String[] args) {
        add.andThen(sub).andThen(mult).andThen(div).accept(10,10);
//        for (Employee emp: Employee.employees){
//            empNameAndJoiningDate.accept(emp.getName(), emp.getJoiningDate());
//        }

        Employee.employees.forEach(employee -> empNameAndJoiningDate.accept(employee.getName(), employee.getJoiningDate()));

    }
}
