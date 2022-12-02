package com.gyk.java.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 26, 10));
        students.add(new Student("Adele", 24, 10));
        students.add(new Student("Tom", 27, 8));


        System.out.println(students);

        students.sort(Comparator.naturalOrder());
        System.out.println(students);


        students.sort(Comparator.reverseOrder());
        System.out.println(students);



    }

}
