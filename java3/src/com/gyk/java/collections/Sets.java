package com.gyk.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        Student john = new Student("John", 22, 10);
        Student johnCopy = new Student("John", 22, 10);

        students.add(john);
        students.add(john);
        students.add(johnCopy);

        System.out.println(students.size());
        System.out.println(students);
    }

}
