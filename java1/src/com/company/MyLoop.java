package com.company;

public class MyLoop {

    static void workLoops() {
        String[] cars = new String[4];
        cars[0] = "BNV";
        cars[1] = "Aubi";

        System.out.println("FOR I");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("");

        System.out.println("FOR EACH");
        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println("");

        System.out.println("WHILE");

        int i = 0;

        while (i < cars.length) {
            System.out.println(cars[i++]);
        }

    }

}
