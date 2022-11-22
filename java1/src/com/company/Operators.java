package com.company;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//        checkTriangle();
        checkCarFuelData();
    }

    static void checkTriangle() {
        System.out.println("Please enter 3 triangle side lengths with space between");
        Scanner scanner = new Scanner(System.in);
        String dataString[] = scanner.nextLine().split(" ");

        if (
                dataString.length == 3 &&
                Arithmetics.isNumeric(dataString[0]) &&
                Arithmetics.isNumeric(dataString[1]) &&
                Arithmetics.isNumeric(dataString[2])
        ) {
            float side1 = Float.parseFloat(dataString[0]);
            float side2 = Float.parseFloat(dataString[1]);
            float side3 = Float.parseFloat(dataString[2]);

            if (
                    (side1 + side2) > side3 &&
                    (side2 + side3) > side1 &&
                    (side1 + side3) > side2
            ) {
                if (side1 == side2 && side2 == side3) {
                    System.out.println(String.format("Triangle is Equilateral. Sides: %.0f %.0f %.0f", side1, side2, side3));
                } else if (
                        side1 == side2 || side2 == side3 || side1 == side3
                ) {
                    System.out.println(String.format("Triangle is Isosceles. Sides: %.0f %.0f %.0f", side1, side2, side3));
                } else {
                    System.out.println(String.format("Triangle is Scalene. Sides: %.0f %.0f %.0f", side1, side2, side3));
                }
            } else {
                System.out.println(String.format("Triangle is Invalid. Sides: %.0f %.0f %.0f", side1, side2, side3));
            }




        } else {
            System.out.println("Wrong input data");
        }
    }

    static void checkCarFuelData() {
        System.out.println("Please enter 4 numbers space between: distance to the destination, how much fuel does the car have in the tank, car fuel usage per 100km and fuel price per liter" );
        Scanner scanner = new Scanner(System.in);
        String dataString[] = scanner.nextLine().split(" ");

        if (
                dataString.length == 4 &&
                Arithmetics.isNumeric(dataString[0]) &&
                Arithmetics.isNumeric(dataString[1]) &&
                Arithmetics.isNumeric(dataString[2]) &&
                Arithmetics.isNumeric(dataString[3])
        ) {
            double distance = Double.parseDouble(dataString[0]);
            double fuel = Double.parseDouble(dataString[1]);
            double consumption = Double.parseDouble(dataString[2]);
            double price = Double.parseDouble(dataString[3]);

            double distanceAvailable = fuel / consumption * 100;

            if (distance <= distanceAvailable) {
                double fuelLeft = fuel - consumption * distance / 100;
                System.out.println(String.format("Destination is in %.0fkm. Car is able to reach the destination." +
                        " It will have %.1f liters of fuel left.", distance, fuelLeft));
            } else {
                double additionalFuelNeeded = distance / 100  * consumption - fuel;
                double additionalPrice = additionalFuelNeeded * price;
                System.out.println(String.format("Destination is in %.0fkm. Car is not able to reach the destination." +
                        " It needs %.1f liter of fuel more. It will cost %.2f.\n", distance, additionalFuelNeeded, additionalPrice));
            }
        }
    }

}
