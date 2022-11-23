package com.gyk.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
