package com.alamin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;
    private List<String> joiningDate;


    public static List<Employee> employees = List.of(
            new Employee(1, "Saima","Cox-Bazar", 4000, List.of(
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate()

            )),
            new Employee(2,"Md. Al Amin","Pabna",5000,List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Sabbir","Pabna",15000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Masud","Pabna",20000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Jahangir","Dhaka",25000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Manik","Barisal",25000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Salman","Dhaka",15000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(2,"Ashik","Dhaka",35000, List.of(
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate()
            ))
    );

}
