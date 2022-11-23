package com.gyk.java.oop.basics.task3;

public class MyBankAtm implements Atm {
    private double balance;

    @Override
    public void widthdraw(Card card, double amount) {

        if (amount > this.getBalance()) {
            throw new InsufficientAtmFundsException("Atm has insufficient funds", new Throwable());
        } else {
            card.debit(amount);
            this.setBalance(this.getBalance() - amount);
            System.out.println(
                    String.format("Withdrawing %.2f money", amount)
            );
            card.printCardBalance();
            System.out.println(
                    String.format("ATM balance: %.2f", this.getBalance())
            );
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public MyBankAtm(double balance) {
        this.balance = balance;
    }
}
