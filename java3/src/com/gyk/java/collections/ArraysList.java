package com.gyk.java.collections;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {

        // ARAY LIST
        ArrayList<Student> students = new ArrayList<Student>();

        Student john = new Student("John", 22, 10);

        System.out.println("Size: " + students.size());
        students.add(john);
        System.out.println("Size: " + students.size());

        System.out.println(students);

        students.remove(john);

        System.out.println("Size: " + students.size());

        ArrayList<Object> kibiras = new ArrayList<>();






    }

}
