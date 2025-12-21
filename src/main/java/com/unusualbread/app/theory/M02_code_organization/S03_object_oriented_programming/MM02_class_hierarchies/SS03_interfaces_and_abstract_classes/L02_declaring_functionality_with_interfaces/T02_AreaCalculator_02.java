package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L02_declaring_functionality_with_interfaces;

/*
Design an interface for a Shape with a method to calculate its area. Implement
the interface in two classes: Rectangle and Circle. The program should read the
dimensions of a shape from the user, create an object of the corresponding
class, and print its area.
*/

import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle2 implements Shape {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class T02_AreaCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeType = scanner.nextLine();

        Shape shape;

        if (shapeType.equalsIgnoreCase("rectangle")) {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);
        } else if (shapeType.equalsIgnoreCase("circle")) {
            double radius = scanner.nextDouble();
            shape = new Circle2(radius);
        } else {
            System.out.println("Invalid shape type!");
            return;
        }

        double area = shape.calculateArea();
        System.out.printf("%.2f\n", area);
    }
}
