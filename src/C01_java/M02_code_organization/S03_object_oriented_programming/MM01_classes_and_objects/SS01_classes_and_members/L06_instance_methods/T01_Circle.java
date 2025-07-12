package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
There is a class named Circle.
This class has one field radius of the double type.

Create two instance methods for this class:
    1. getLength that returns the double representing the
       length of the circumference of this circle;
    2. getArea that returns the double representing the area of this circle.
*/

class Circle {

    double radius;

    // write methods here
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}