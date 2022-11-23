package com.gyk.java.oop.basics;

public class SquareApplication {
    public static void main(String[] args) {
        Square rectangleNotSquare1 = new Square(2.,3.5);
        Square rectangleNotSquare2 = new Square(5.3,2.5);
        Square rectangleNotSquare3 = new Square(-5.3,200.5);
        Square squareFoSho = new Square(3., 3.);

        Square[] squares = {
                rectangleNotSquare1,
                rectangleNotSquare2,
                rectangleNotSquare3,
                squareFoSho
        };

        for(Square sq: squares) {
            System.out.println(sq);
        }
    }

}
