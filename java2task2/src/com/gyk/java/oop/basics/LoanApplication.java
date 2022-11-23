package com.gyk.java.oop.basics;

public class LoanApplication {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Arnoldas",
                "Starkauskas",
                30,
                "3123123423"
        );

        Loan loan1 = new Loan(
                1,
                123.23,
                LoanType.CONSUMER,
                "2023-03-23"
        );

        Loan loan2 = new Loan(
                2,
                33321.32,
                LoanType.LEASING,
                "2029-03-03"
        );

        Loan[] loans = {loan1, loan2};

        customer.setLoans(loans);

        System.out.println(customer);

    }

}
