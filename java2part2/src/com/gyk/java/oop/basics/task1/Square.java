package com.gyk.java.oop.basics.task1;

public class Square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + ", " +
                "area=" + this.calculateArea() + ", " +
                "perimeter=" + this.calculatePerimeter() +
                '}';
    }
}
