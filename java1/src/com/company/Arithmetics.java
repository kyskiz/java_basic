package com.company;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Arithmetics.feet();
//        Arithmetics.cube();
    }

    static void cube() {
        /*
        Prerequisites:
        Create class named Arithmetics in the same package as before with main method to execute your program.
        Task:
        Calculate cube’s volume and perimeter.
        Input: 5
        Output:
        Cube’s volume: 125cm3.
        Cube’s perimeter: 30cm.
         */

        System.out.println("Please enter length of cube");
        Scanner scanner = new Scanner(System.in);
        String lengthString = scanner.nextLine();

        if (!isNumeric(lengthString)) {
            System.out.println("Value is not number");
        } else {
            Integer length = Integer.parseInt(lengthString);
            Integer perimeter = length * 6;
            double volume = Math.pow(length, 3);

            System.out.println(String.format("Cube’s volume: %.0f cm3.", volume));
            System.out.println(String.format("Cube’s perimeter: %d cm3.", perimeter));
        }



    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    static void feet() {
        /*
        Create a method which converts feet and inches to centimeters. It needs to have two parameters. First parameter is feet and second is inches.
        Hint: 1 inch = 2.54cm and 1 foot = 12 inches
        Input: 2.4 4
        Output: 2.4 feet and 4.0 inches = 5,083,312000 cm

         */

        System.out.println("Please enter feed and inches with space in between");
        Scanner scanner = new Scanner(System.in);
        String dataString[] = scanner.nextLine().split(" ");

        if (dataString.length == 2 && isNumeric(dataString[0]) && isNumeric(dataString[1])) {
            float feet = Float.parseFloat(dataString[0]);
            float inches = Float.parseFloat(dataString[1]);
            float feet2Inch = 2.54f;
            float inch2Cm = 12f;
            float result = (feet * feet2Inch + inches) * inch2Cm;

            System.out.println(String.format("%.2f feet and %.2f inches = %.2f cm", feet, inches, result));
        } else {
            System.out.println("Wrong input data");
        }

    }

}
