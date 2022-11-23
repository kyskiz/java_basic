package com.gyk.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee emptyEmployee = new Employee();
        Employee employee = new Employee(
                "Arnoldas",
                "Starkauskas",
                ContractType.FULL_TIME,
                "2019-03-16",
                "Software Engineer"
        );


        System.out.println("Empty employee info:");
        System.out.println(emptyEmployee);
        System.out.println("");

        System.out.println("Employee info:");
        System.out.println(employee);


    }

}
