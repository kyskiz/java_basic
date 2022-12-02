package com.gyk.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionTask2 {

    public static void main(String[] args) {
        //Create a ArrayList of fruits and add them to the list.
        //Apple, Pear, Banana, Apple, Cherry, Fig, Orange, Banana, Apple.
        //Print the size of this list.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.addAll(List.of("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple"));

        HashSet<String> fruitsSet = new HashSet<>(fruits);

        System.out.println("Fruits hash set:");
        for (String fruit: fruitsSet) {
            System.out.println(fruit);
        }
        System.out.println("Hash set size: " + fruitsSet.size());


    }

}
