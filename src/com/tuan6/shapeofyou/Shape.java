package com.tuan6.shapeofyou;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    protected Shape() {
        color = "red";
        filled = true;
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape[color = " + getColor() + ", filled = " + isFilled() + "]";
    }
}
