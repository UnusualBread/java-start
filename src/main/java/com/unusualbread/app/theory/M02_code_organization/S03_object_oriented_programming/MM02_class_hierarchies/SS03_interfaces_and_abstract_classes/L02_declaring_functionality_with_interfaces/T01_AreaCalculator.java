package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L02_declaring_functionality_with_interfaces;

/*
The Circle class represents a circle. Implement the Measurable interface and
add a single method area that returns the area of a circle.
*/

class Circle implements Measurable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

interface Measurable {
    double area();
}
