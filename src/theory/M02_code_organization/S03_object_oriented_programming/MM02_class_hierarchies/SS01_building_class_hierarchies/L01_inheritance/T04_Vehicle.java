package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L01_inheritance;

/*
Design a simple vehicle hierarchy with a base class 'Vehicle' and two subclasses
'Car' and 'Motorcycle'. The 'Vehicle' class should have properties 'brand' and
'year'. 'Car' should add a 'numDoors' property, while 'Motorcycle' should add a
'hasSidecar' property. Implement appropriate constructors and a 'displayInfo()'
method for each class. Create instances based on user input and display their
information. Input: Read three lines containing the vehicle type ("Car" or
"Motorcycle"), brand, and year. For Car, also read the number of doors. For
Motorcycle, read a boolean indicating if it has a sidecar. Output: Print the
vehicle information using the displayInfo() method.
*/

import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {
    protected int numDoors;

    Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    void displayInfo() {
        System.out.println(this.brand + " (" + this.year + ")");
        System.out.println("Number of doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    protected boolean hasSidecar;

    Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    void displayInfo() {
        System.out.println(this.brand + " (" + this.year + ")");
        System.out.println("Has sidecar: " + hasSidecar);
    }
}

public class T04_Vehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            Car car = new Car(brand, year, numDoors);
            car.displayInfo();
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            Motorcycle motorcycle = new Motorcycle(brand, year, hasSidecar);
            motorcycle.displayInfo();
        }

        scanner.close();
    }
}
