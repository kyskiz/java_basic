package com.gyk.java.oop.basics.task3;

public class InsufficientAtmFundsException extends Exception {
    public InsufficientAtmFundsException(String errorMessage, Throwable err) {
        super(errorMessage, err);
        System.out.println(errorMessage);

    }
}
