package com.gyk.java.oop.basics;

public class Loan {
//    d, amount, loan type (leasing, consumer) andtermination date
    private int id;
    private double amount;
    private LoanType type;
    private String terminationDate;

    public double getAmount() {
        return amount;
    }

    public Loan(int id, double amount, LoanType type, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.terminationDate = terminationDate;
    }
}
