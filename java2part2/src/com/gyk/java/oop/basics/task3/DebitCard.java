package com.gyk.java.oop.basics.task3;

public class DebitCard extends Card {
    @Override
    void credit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    void debit(double amount) {
        if (this.getBalance() < amount) {
            throw new NotEnoughBalanceException("There is not enough balance on this card", new Throwable());
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

}
