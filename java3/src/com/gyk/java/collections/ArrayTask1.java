package com.gyk.java.collections;

public class ArrayTask1 {

    public static void main(String[] args) {
        String[] cars = {
                "Subaru",
                "BMW",
                "Suzuki",
        };

        System.out.println(cars[1]);

        cars[2] = "Honda";

        System.out.println(cars.length);

        for (String car: cars) {
            System.out.println(car);
        }
    }

}
