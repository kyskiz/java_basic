package com.company;

public class CreditCard extends Card {

    @Override
    public Integer calculateBalance() {
        return getBalance() + 1000;
    }
}
