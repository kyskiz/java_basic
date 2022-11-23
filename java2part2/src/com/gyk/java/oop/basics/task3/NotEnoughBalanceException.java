package com.gyk.java.oop.basics.task3;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException(String errorMessage, Throwable err) {
        super(errorMessage, err);
        System.out.println(errorMessage);

    }

}
