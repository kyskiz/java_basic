package com.gyk.java.oop.basics.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyBankAtmAnotherTest {

    @Test
    public void test_myBankAtmConstructorAndSetter() {
        Double amount1 = 5000.;
        Double amount2 = 10000.;
        MyBankAtm myAtm = new MyBankAtm(amount1);

        Assertions.assertEquals(myAtm.getBalance(), amount1);

        myAtm.setBalance(amount2);
        Assertions.assertEquals(myAtm.getBalance(), amount2);

    }

    @Test
    public void test_myBankAtmWithdrawHappyFlow() throws InsufficientAtmFundsException {
        Double amountInitial = 1000.;
        Double amountWithDraw = 500.;

        MyBankAtm myAtm = new MyBankAtm(amountInitial);
        CreditCard creditCard = new CreditCard(amountWithDraw, "Card Holder", "1234 1234 1234 1234", 5., 1000.);

        myAtm.widthdraw(creditCard, amountWithDraw);

        Assertions.assertEquals(myAtm.getBalance(), (amountInitial - amountWithDraw));
    }

    @Test()
    public void test_myBankAtmWithdrawSadFlowThrowsException()  {


        Throwable exception = assertThrows(InsufficientAtmFundsException.class, () -> {
            Double amountInitial = 100.;
            Double amountWithDraw = amountInitial + 100.;

            MyBankAtm myAtm = new MyBankAtm(amountInitial);
            CreditCard creditCard = new CreditCard(amountWithDraw, "Card Holder", "1234 1234 1234 1234", 5., 1000.);

            myAtm.widthdraw(creditCard, amountWithDraw);
        });
        Assertions.assertEquals("Atm has insufficient funds", exception.getMessage());

//        myAtm.widthdraw(creditCard, amountWithDraw);
//
//        Exception exception = assertThrows(InsufficientAtmFundsException.class, () -> {
//
//        });
//
//        String expectedMessage = "Atm has insufficient funds";
//        String actualMessage = exception.getMessage();
//
//        assertTrue(actualMessage.contains(expectedMessage));

    }

}

/*
@Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {

        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);

    }
 */
