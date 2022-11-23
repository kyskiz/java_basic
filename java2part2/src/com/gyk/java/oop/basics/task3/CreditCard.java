package com.gyk.java.oop.basics.task3;

public class CreditCard extends Card {
    private double interest;
    private final double credit;

    @Override
    void credit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    void debit(double amount) {
        if ((this.getBalance() + this.getCredit()) < amount) {
            throw new NotEnoughCreditException("There is not enough credit on this card", new Throwable());
        } else {
            this.setBalance(this.getBalance() - amount);
        }


    }

    public CreditCard(double balance, String cardHolderName, String cardNumber, double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getCredit() {
        return credit;
    }

}
