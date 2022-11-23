package com.gyk.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args) {
        Account firstAccount = new Account("asdqwe123", "Account first");
        Account secondAccount = new Account("qwertyuiop", "Account second");

        System.out.println(firstAccount);
        System.out.println(secondAccount);

        firstAccount.credit(20);
        firstAccount.credit(10);
        System.out.println(firstAccount);

        secondAccount.credit(10);
        System.out.println(secondAccount);

        firstAccount.debit(500);

        secondAccount.transferTo(firstAccount, 70);

        firstAccount.debit(30);

        firstAccount.transferTo(secondAccount, 10);

        System.out.println(firstAccount);
        System.out.println(secondAccount);

    }

}
