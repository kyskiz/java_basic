package com.gyk.java.oop.basics.task3;

public class InsufficientAtmFundsException extends RuntimeException {
    public InsufficientAtmFundsException(String errorMessage, Throwable err) {
        super(errorMessage, err);
        System.out.println(errorMessage);

    }
}
