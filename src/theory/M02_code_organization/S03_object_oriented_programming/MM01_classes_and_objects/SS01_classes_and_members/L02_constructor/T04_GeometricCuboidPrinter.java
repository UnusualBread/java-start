package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L02_constructor;

/*
Write a program that reads width, height and length, creates an instance named
cuboid and outputs the result of cuboid.toString().
*/

import java.util.Scanner;

public class T04_GeometricCuboidPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();

        // creating an instance
        GeometricCuboid cuboid = new GeometricCuboid(width, height, length);

        System.out.println(cuboid.toString());

        scanner.close();
    }
}

class GeometricCuboid {
    private int width;
    private int height;
    private int length;

    public GeometricCuboid(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cuboid(" +
                "w=" + width +
                ", h=" + height +
                ", l=" + length + ')';
    }
}