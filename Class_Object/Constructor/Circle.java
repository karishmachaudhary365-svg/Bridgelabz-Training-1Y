package com.gla.Constructor;

public class Circle{
    double radius;

    Circle() {
        this(1.0);
    }


    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        defaultCircle.display();
        customCircle.display();
    }
}
