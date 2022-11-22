package com.company;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        Basics.task1();
        Basics.task2();
    }



    static void task1() {
        System.out.println("Please enter your name and surname...");
        Scanner scanner = new Scanner(System.in);
        String nameSurname = scanner.nextLine();

        System.out.println(String.format("Hello, I am %s. I am attending GYK 2022! ", nameSurname));
    }

    static void task2() {
//        Create all of the primitives (except long and double) with different values. Concatenate them into a string and print it to the screen.
        boolean bool = true;
        byte byt = 0;
        char characterH = 'H';
        float floaty = 2.0f;
        int integer1 = '1';
        short shorty = 3110;

        System.out.println(String.format("%c%s %d%s  %f %b", characterH, shorty, integer1, byt, floaty, bool));
    }
}
