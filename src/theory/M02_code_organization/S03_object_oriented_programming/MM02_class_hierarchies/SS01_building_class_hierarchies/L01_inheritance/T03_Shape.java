package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L01_inheritance;

/*
Create a base class called Shape with a constructor that takes the shape's name
as a parameter. Then create a derived class called Rectangle that inherits from
Shape and adds a constructor which takes the rectangle's length and width as
parameters, as well as a method to calculate the rectangle's area. Create an
instance of the Rectangle class, passing the name, length, and width to the
constructor. Print the rectangle's name and area.
*/

import java.util.Scanner;

// Define the base class Shape
class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }
}

// Define the derived class Rectangle
final class Rectangle extends Shape {
    private final int length;
    private final int width;

    Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double areaOfRectangle() {
        return this.length * this.width;
    }
}

public class T03_Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the rectangle's name, length, and width from the user
        String name = scanner.nextLine();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        scanner.close();

        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(name, length, width);

        // Print the rectangle's name and area
        System.out.println(rectangle.name);
        System.out.println(rectangle.areaOfRectangle());
    }
}
