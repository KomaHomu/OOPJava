package com.tuan6.geometricobject;

public class Rectangle implements GeometricObject {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle[width = " + width + ", length = " + length + "]";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
