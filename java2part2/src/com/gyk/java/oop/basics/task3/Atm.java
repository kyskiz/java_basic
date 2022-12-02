package com.gyk.java.oop.basics.task3;

public interface Atm {
    void widthdraw(Card card, double amount) throws InsufficientAtmFundsException;
}
