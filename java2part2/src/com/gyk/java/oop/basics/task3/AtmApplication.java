package com.gyk.java.oop.basics.task3;

public class AtmApplication {

    public static void main(String[] args) throws InsufficientAtmFundsException {
        CreditCard creditCard = new CreditCard(
                100.,
                "Vardas Pavardas",
                "1234123412341234",
                5.,
                1000.
        );

        DebitCard debitCard = new DebitCard(
                500.,
                "Vardas Pavardas",
                "7890789078907890"
        );

        MyBankAtm atm = new MyBankAtm(1000.);

        creditCard.printCardBalance();
        atm.widthdraw(creditCard, 500.);

        debitCard.printCardBalance();
        atm.widthdraw(debitCard, 500.);

        atm.widthdraw(creditCard, 50);


    }

}
