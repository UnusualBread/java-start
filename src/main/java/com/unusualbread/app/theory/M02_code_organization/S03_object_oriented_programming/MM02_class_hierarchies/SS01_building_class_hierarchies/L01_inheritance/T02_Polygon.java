package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L01_inheritance;

/*
Create a base class called Polygon with methods to set and get the length of sides.
Then create a derived class called Square that inherits from Polygon and adds a
method to calculate the area of the square. Given the side length of a square,
calculate its area and print the result. You need to scan a single integer value
representing the side length of the square and print the area of the square.
*/

import java.util.Scanner;

public class T02_Polygon {

    // Base class Polygon
    static class Polygon {
        private int sideLength;

        // Method to set the length of sides
        public void setSideLength(int sideLength) {
            this.sideLength = sideLength;
        }

        // Method to get the length of sides
        public int getSideLength() {
            return sideLength;
        }
    }

    // Derived class Square
    static final class Square extends Polygon {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideLength = scanner.nextInt();
        scanner.close();

        // Create an instance of Square
        Square square = new Square();

        // Set the side length
        square.setSideLength(sideLength);

        // Calculate and print the area
        System.out.println(Math.pow(square.getSideLength(), 2));
    }
}
