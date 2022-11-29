package com.gyk.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionTask3 {

    public static void main(String[] args) {
        //Convert ArrayList of Students to the Map.
        //Add id to Student class
        //Print map.
        //Take 4 index Student and change his grade and age.
        //Print map key and value
        //For value use toString.

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.addAll(
                List.of(
                    new Student(1, "Tomas", 30, 10),
                    new Student(2, "John", 23, 8),
                    new Student(3, "Rick", 27, 7),
                    new Student(4, "Elie", 25, 9),
                    new Student(5, "Ema", 31, 10)
                )
        );

        HashMap<Integer, Student> studentHashMap = new HashMap();

        for (Student student: studentArrayList) {
            studentHashMap.put(student.getId(), student);
        }

        System.out.println(studentHashMap);

        Student student4th = studentArrayList.get(4);

        student4th.setAge(22);
        student4th.setGrade(5);

        for (Integer key: studentHashMap.keySet()) {
            System.out.println(
                    String.format("%d : %s", key, studentHashMap.get(key))
            );
        }


    }

}
