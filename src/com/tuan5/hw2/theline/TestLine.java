package com.tuan5.hw2.theline;

public class TestLine { // the better one, imo

    public static void main(String[] args) {

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 6);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
    }
}
