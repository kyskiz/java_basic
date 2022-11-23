package com.gyk.java.oop.basics.task3;

public abstract class Card {
    double balance;
    String cardHolderName;
    String cardNumber;
    abstract void credit(double amount);
    abstract void debit(double amount);

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void printCardBalance() {
        System.out.println(
                String.format("Card balance: %.2f", this.getBalance())
        );
    }
}
