package com.gyk.java.oop.basics;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    int debit(int amount) {
        if (amount >= this.balance) {
            this.printAmountExceeded(amount);
        } else {
            this.balance -= amount;
        }

        return this.balance;
    }

    void printAmountExceeded(int amount) {
        System.out.println(
                String.format(
                        "Cannot withdraw %d amount, only %d money is left, amount exceeded", amount, this.balance
                )
        );
    }

    void transferTo(Account account, int amount) {
        if (amount >= this.balance) {
            this.printAmountExceeded(amount);
        } else {
            this.balance -= amount;
            account.credit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
