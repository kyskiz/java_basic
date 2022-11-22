package com.company;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
//        handleYearWhileLoop();
        handleFactorial();
    }

    static void handleYearLoop() {
        System.out.println("Please enter days number per year (365)");
        Scanner scanner = new Scanner(System.in);
        String dayInput = scanner.nextLine();

        if (Arithmetics.isNumeric(dayInput)) {
            int days = Integer.parseInt(dayInput);
            int hours = 0;
            int MINUTES_PER_HOUR = 60;

            for(int i = 0; i < days; i++) {
                hours += 24;
            }

            System.out.println(
                    String.format("There are %d hours or %d minutes in %d days.", hours, hours * MINUTES_PER_HOUR, days)
            );

        } else {
            System.out.println("Wrong data input");
        }
    }

    static void handleYearWhileLoop() {
        System.out.println("Please enter days number per year (365)");
        Scanner scanner = new Scanner(System.in);
        String dayInput = scanner.nextLine();

        if (Arithmetics.isNumeric(dayInput)) {
            int days = Integer.parseInt(dayInput);
            int hours = 0;
            int MINUTES_PER_HOUR = 60;

            int i = 0;
            while (i < days) {
                hours += 24;
                i++;
            }

            System.out.println(
                    String.format("There are %d hours or %d minutes in %d days.", hours, hours * MINUTES_PER_HOUR, days)
            );

        } else {
            System.out.println("Wrong data input");
        }
    }

    static void handleFactorial() {
        System.out.println("Please enter number ");
        Scanner scanner = new Scanner(System.in);
        String numberInput = scanner.nextLine();

        if (Arithmetics.isNumeric(numberInput)) {
            int number = Integer.parseInt(numberInput);
            int result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            System.out.println(
                    String.format("%d! equals %d", number, result)
            );


        } else {
            System.out.println("Wrong data input");
        }
    }

}
