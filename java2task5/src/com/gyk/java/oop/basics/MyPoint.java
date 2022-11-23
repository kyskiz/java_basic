package com.gyk.java.oop.basics;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    private double getDistance(int x1, int y1, int x2, int y2) {
//        d = √[( y2 –  y1)² + ( x1 –  x2)²]
        double result = Math.sqrt(
                Math.pow(y2 - y1, 2) + Math.pow(x1 - x2, 2)
        );

        return result;
    }

    double distance() {
        return this.getDistance(this.x, this.y, 0, 0);
    }

    double distance(int x, int y) {
        return this.getDistance(this.x, this.y, x, y);
    }

    double distance(MyPoint point) {
        return this.getDistance(this.x, this.y, point.getX(), point.getY());
    }
}
