package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L01_abstract_class;

/*
Create an abstract class called Shape with an abstract method area(). Implement
two classes Rectangle and Circle that extend the Shape class and implement the
area() method. Given the dimensions of a rectangle and a circle, calculate and
print the area of each shape.
*/

import java.util.Scanner;

// Define the abstract Shape class with an abstract area() method
abstract class Shape2 {
    final double length;
    final double width;
    final double radius;

    public Shape2(double length, double width, double radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    abstract double area();
}

// Implement the Rectangle class that extends Shape
class Rectangle2 extends Shape2 {
    public Rectangle2(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    double area() {
        return super.length * super.width;
    }
}

class Circle2 extends Shape2 {
    public Circle2(double length, double width, double radius) {
        super(length, width, radius);
    }

    @Override
    double area() {
        return Math.PI * Math.pow(super.radius, 2);
    }
}

// Implement the Circle class that extends Shape

public class T04_AreaGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the rectangle
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Read the radius of the circle
        double radius = scanner.nextDouble();

        // Create instances of Rectangle and Circle
        Rectangle2 rectangle = new Rectangle2(length, width, radius);

        // Calculate and print the area of the rectangle
        Circle2 circle = new Circle2(length, width, radius);

        // Calculate and print the area of the circle
        System.out.println(rectangle.area() + "\n" + circle.area());

        scanner.close();
    }
}
