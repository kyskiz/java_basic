package com.company;

import java.util.Arrays;

public class MyArray {
    static void workArrays() {
        System.out.println("WORK ARRAYS");

        //arrays
        String[] cars = new String[4];
        cars[0] = "BNV";
        cars[1] = "Aubi";

        String[] cars2 = {
                "BMW",
                "Audi",
                "Ferrari"
        };

        System.out.println("");
        System.out.println(cars);
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(Arrays.toString(cars));


        System.out.println("");
        System.out.println(cars2);
        System.out.println(Arrays.toString(cars2));
    }
}
