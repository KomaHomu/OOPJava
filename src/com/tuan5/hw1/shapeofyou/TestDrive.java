package com.tuan5.hw1.shapeofyou;

public class TestDrive {

    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);

        square.setSide(2.0);
        System.out.println(square);
        System.out.println("Square's side: " + square.getSide());
    }
}
