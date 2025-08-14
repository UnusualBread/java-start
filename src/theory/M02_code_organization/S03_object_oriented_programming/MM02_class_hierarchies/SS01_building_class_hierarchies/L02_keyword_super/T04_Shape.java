package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L02_keyword_super;

/*
Create a base class called Shape with a constructor that takes the shape's name
as a parameter. Then create a derived class called Rectangle that inherits from
Shape and has a constructor that takes the shape's name, width, and height as
parameters. The Rectangle constructor should call the base class constructor
using the super keyword. Finally, create a Rectangle object and print out its
name, width, and height.
*/

import java.util.Scanner;

class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }
}

public class T04_Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();

        Rectangle rectangle = new Rectangle(name, width, height);

        System.out.println("Name: " + rectangle.name);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Height: " + rectangle.height);
    }
}
