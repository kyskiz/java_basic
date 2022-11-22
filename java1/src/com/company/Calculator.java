package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        handleShape();
    }

    static void handleShape() {
        boolean isExit = false;

        while (!isExit) {
            System.out.println("Please enter type and side information of figure ('Exit' to end) ");
            Scanner scanner = new Scanner(System.in);
            String[] dataString = scanner.nextLine().split(" ");
            String type = dataString[0];

            switch (type) {
                case "Exit":
                    isExit = true;
                    break;
                case "Rectangle":
                    handleRectangle(dataString);
                    break;
                case "Square":
                    handleSquare(dataString);
                    break;
                case "Triangle":
                    handleTriangle(dataString);
                    break;

                case "Saturday":
                    break;
                default:
                    handleWrongData();
            }


        }

    }

    private static void handleWrongData() {
        System.out.println("Wrong data input, try <Shape> <side> <side?> <side?> (ex. Rectangle 5 7).........");
    }

    private static void handleRectangle(String[] dataInput) {
        if (dataInput.length >= 3 && Arithmetics.isNumeric(dataInput[1]) && Arithmetics.isNumeric(dataInput[2])) {
            float sideA = Float.parseFloat(dataInput[1]);
            float sideB = Float.parseFloat(dataInput[2]);

            if (sideA > 0 && sideB > 0) {
                float S = sideA * sideB;
                float P = 2 * (sideA + sideB);
                System.out.println(String.format("Rectangle perimeter is %.1f and area is %.1f.", P , S));
            } else {
                handleWrongData();
            }

        } else {
            handleWrongData();
        }
    }

    private static void handleSquare(String[] dataInput) {
        if (dataInput.length >= 2 && Arithmetics.isNumeric(dataInput[1])) {
            float side = Float.parseFloat(dataInput[1]);

            if (side > 0) {
                float S = side * side;
                float P = 4 * side;
                System.out.println(String.format("Square perimeter is %.1f and area is %.1f.", P , S));
            } else {
                handleWrongData();
            }

        } else {
            handleWrongData();
        }
    }

    private static void handleTriangle(String[] dataInput) {
        if (dataInput.length >= 4 && Arithmetics.isNumeric(dataInput[1]) && Arithmetics.isNumeric(dataInput[2])&& Arithmetics.isNumeric(dataInput[3])) {
            float sideA = Float.parseFloat(dataInput[1]);
            float sideB = Float.parseFloat(dataInput[2]);
            float sideC = Float.parseFloat(dataInput[3]);

            if (sideA > 0 && sideB > 0 && sideC > 0) {
                float P = sideA + sideB + sideC;
                float semiP = P / 2;
                double S = Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
                System.out.println(String.format("Triangle perimeter is %.1f and area is %.1f.", P , S));
            } else {
                handleWrongData();
            }

        } else {
            handleWrongData();
        }
    }

}
