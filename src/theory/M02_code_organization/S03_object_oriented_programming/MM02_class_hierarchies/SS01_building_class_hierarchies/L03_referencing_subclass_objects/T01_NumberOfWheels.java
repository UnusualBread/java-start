package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L03_referencing_subclass_objects;

/*
Create a class hierarchy for different types of vehicles. The base class should
have a protected instance variable for the number of wheels. Derive classes for
bicycle, motorcycle, and car from the base class. Each derived class should
have a method to print the number of wheels for that vehicle type.
*/

import java.util.Scanner;

// Base class for vehicles
class Vehicle {
    protected int numWheels;

    public Vehicle(int wheels) {
        numWheels = wheels;
    }

    void printWheels() {}
}

// TODO: Create the Bicycle class that extends Vehicle
class Bicycle extends Vehicle {
    Bicycle(int wheels) {
        super(wheels);
    }

    void printWheels() {
        System.out.println("A bicycle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {
    Motorcycle(int wheels) {
        super(wheels);
    }

    void printWheels() {
        System.out.println("A motorcycle has " + numWheels + " wheels.");
    }
}

// TODO: Create the Car class that extends Vehicle
class Car extends Vehicle {
    Car(int wheels) {
        super(wheels);
    }

    void printWheels() {
        System.out.println("A car has " + numWheels + " wheels.");
    }
}

public class T01_NumberOfWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();
        scanner.close();

        // TODO: Create an instance of the appropriate vehicle class based on vehicleType
        Vehicle vehicle = switch (vehicleType) {
            case "bicycle" -> new Bicycle(2);
            case "motorcycle" -> new Motorcycle(2);
            case "car" -> new Car(4);
            default -> new Vehicle(0);
        };

        // TODO: Call the printWheels() method on the vehicle instance
        vehicle.printWheels();
    }
}
