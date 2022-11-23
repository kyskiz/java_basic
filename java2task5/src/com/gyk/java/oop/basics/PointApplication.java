package com.gyk.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(1 ,6);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance());
        System.out.println(point1.distance(3, 10));

        int[] coords1 = point1.getXY();
        int[] coords2 = point2.getXY();

        String coords1String = "Point 1 coordinates are";

        for (int coord: coords1) {
            coords1String += (coord + " ");
        }

        System.out.println(coords1String);

        String coords2String = "Point 2 coordinates are " + coords2[0] + " " + coords2[1];

        System.out.println(coords2String);


    }
}
