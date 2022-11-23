package com.gyk.java.oop.basics.task1;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", " +
                "area=" + String.format("%.2f", this.calculateArea()) + ", " +
                "perimeter=" + String.format("%.2f", this.calculatePerimeter()) +
                '}';
    }
}
