package com.gyk.java.oop.basics;

import java.util.Arrays;

public class Customer {
//    name, surname, age, personal number, loans
    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    private Loan[] loans;

    public Customer() {
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public Customer(String name, String surname, int age, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    String getLoansData() {
        double loanSum = 0;

        for(Loan loan: getLoans()) {
            loanSum += loan.getAmount();
        }

        return String.format("%d loans totaling for %.2f amount", this.getLoans().length, loanSum);


    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + this.getLoansData() +
                '}';
    }
}
