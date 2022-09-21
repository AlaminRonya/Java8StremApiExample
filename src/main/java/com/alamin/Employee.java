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
    private String gender;
    private String address;
    private double salary;
    private List<String> joiningDate;


    public static List<Employee> employees = List.of(
            new Employee(1, "Saima","FEMALE","Cox-Bazar", 4000, List.of(
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate()

            )),
            new Employee(2,"Md. Al Amin","MALE","Pabna",5000,List.of(
                    new DateClass().getDate()
            )),
            new Employee(3,"Sabbir","MALE" ,"Pabna",15000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(4,"Masud","MALE" ,"Pabna",20000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(5,"Jahangir","MALE" ,"Dhaka",25000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(6,"Manik","MALE" ,"Barisal",25000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(7,"Salman","MALE" ,"Dhaka",15000, List.of(
                    new DateClass().getDate()
            )),
            new Employee(8,"Ashik","MALE" ,"Dhaka",35000, List.of(
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate(),
                    new DateClass().getDate()
            ))
    );

}
