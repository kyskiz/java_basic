package com.gyk.java.oop.basics.task3;

public class NotEnoughCreditException extends RuntimeException {
    public NotEnoughCreditException(String errorMessage, Throwable err) {
        super(errorMessage, err);
        System.out.println(errorMessage);

    }
}
