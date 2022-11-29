package com.gyk.java.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        Student john = new Student("John", 22, 10);

        studentMap.put("john", john);
        System.out.println(studentMap.get("john"));

        System.out.println("overridden mapped value:");
        studentMap.put("john", new Student("John Old", 30, 9));
        System.out.println(studentMap.get("john"));

        System.out.println("no mapped value:");
        System.out.println(studentMap.get("asd"));

        System.out.println("map data:");
        System.out.println(studentMap);

        studentMap.putIfAbsent("john", new Student("a", 22, 2));

        System.out.println("key set:");
        System.out.println(studentMap.keySet());
        System.out.println("values:");
        System.out.println(studentMap.values());
    }

}
