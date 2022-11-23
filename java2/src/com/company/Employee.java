package com.company;

public class Employee extends Person implements Worker {
    private int salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary + "," +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    // OVERLOADING

    public double calcSalary() {
        return this.salary * Math.random();
    }

    public double calcSalary(double number) {
        return this.salary * number;
    }

    public double calcSalary(double number, double penalty) {
        return this.salary * number - penalty;
    }

    @Override
    public void doWork() {
        System.out.println(this.getName() + " is working");
    }
}
