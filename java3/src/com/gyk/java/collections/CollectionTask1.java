package com.gyk.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTask1 {

    public static void main(String[] args) {
        Integer[] intArray = {
                1, 5 ,2 ,4 , 7, 8, 5
        };

        List<Integer> integerList = Arrays.asList(intArray);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(
                    String.format("List item %d: %d", i, integerList.get(i))
            );
        }

        System.out.println("------------------");

        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Student> studentsToRemove = new ArrayList<Student>();

        students.add(new Student("Marta", 30, 10));
        students.add(new Student("Tomas", 23, 7));
        students.add(new Student("Anele", 26, 8));
        students.add(new Student("Vygintas", 29, 9));
        students.add(new Student("Natalija", 21, 8));

        for (Student student : students) {
            if (student.getAge() > 25) {
                studentsToRemove.add(student);
            }
        }

        for (Student student: studentsToRemove) {
            students.remove(student);
        }

        System.out.println("Remaining students:");

        for (Student student: students) {
            System.out.println(student);
        }



    }

}
