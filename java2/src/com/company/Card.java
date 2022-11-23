package com.company;

public abstract class Card {
    private Integer balance;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public abstract Integer calculateBalance();
}
