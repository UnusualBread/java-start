package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
You are given a class named Box that has three double fields.
Create an instance method to calculate the volume of the box.
The method must be named getVolume.
It should take no arguments and return a double result.
*/

class Box {

    double height;
    double width;
    double length;

    // write a method here
    public double getVolume() {
        return height * width * length;
    }
}