package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L02_method_overriding;

/*
Create a Vehicle hierarchy with a base Vehicle class and two subclasses: Car
and Motorcycle. Implement a method getInfo() in the Vehicle class that returns
a string with vehicle type and speed. Override getInfo() in subclasses to
include additional information (number of doors for Car, has_sidecar for
Motorcycle). The program should take a single integer input representing the
speed and output the getInfo() result for both a Car and a Motorcycle instance
with that speed.
*/

import java.util.Scanner;

public class T05_VehicleInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        scanner.close();

        Vehicle car = new Car(speed, 4);
        Vehicle motorcycle = new Motorcycle(speed, false);

        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
    }
}

class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public String getInfo() {
        return "";
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(int speed, int numberOfDoors) {
        super(speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car: Speed " + super.speed + " mph, Doors: " + this.numberOfDoors;
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(int speed, boolean hasSidecar) {
        super(speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motorcycle: Speed " + super.speed + " mph, Sidecar: " + this.hasSidecar;
    }
}
