package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L07_multiple_constructors;

/*
Create a Java class named Circle with two constructors. The default constructor
should create a circle with a radius of 1, while the second constructor should
accept a single parameter for radius value. Both constructors should initialize
an area variable based on the radius. Create functions getRadius() and
getArea() to return the circle's radius and area respectively. If the 'n' input
is a positive number, create a circle with radius 'n', otherwise create a
default circle. The area should be calculated as πr^2 and rounded off to
nearest whole number for simplicity.
*/

import java.util.Scanner;

// Define the Circle class here
class Circle {
    private final int radius;
    private final int area;

    Circle() {
        this.radius = 1;
        this.area = (int) Math.round(Math.PI * Math.pow(this.radius, 2));
    }

    Circle(int radius) {
        this.radius = radius;
        this.area = (int) Math.round(Math.PI * Math.pow(this.radius, 2));
    }

    public int getRadius() {
        return this.radius;
    }

    public int getArea() {
        return this.area;
    }
}

public class T03_RadiusAndAreaGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Circle circle;
        if (n > 0) {
            circle = new Circle(n);
        } else {
            circle = new Circle();
        }

        System.out.println(circle.getRadius() + " " + circle.getArea());
    }
}
