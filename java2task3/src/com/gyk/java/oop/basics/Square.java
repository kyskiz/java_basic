package com.gyk.java.oop.basics;

public class Square {
    private Double length;
    private Double width;

    public Square(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    Double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    Double getArea() {
        return this.length * this.width;
    }

    Boolean validate() {
        return (length > 0 && width > 0);
    }

    @Override
    public String toString() {
        if (this.validate()) {
            return String.format(
                    "Sides are %.1f and %.1f, area is %.2f and perimeter is %.1f",
                    this.getLength(),
                    this.getWidth(),
                    this.getArea(),
                    this.getPerimeter()
            );
        } else {
            return String.format(
                    "Rectangle with sides %.1f and %.1f is not valid", this.getWidth(), this.getLength()
            );
        }
    }
}
