package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L02_access_modifiers;

/*
You are to write a Java program that defines a 'Car' class with a private field
'speed', which is an integer. The class should also have a public method 'drive'
that takes an integer as input and adds it to the 'speed'. If the end result is
greater than 200, the program should cap the speed at 200. Finally, the program
should have another public method 'displaySpeed' that prints the current speed
value.
*/

import java.util.Scanner;

public class T01_SpeedSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSpeed = sc.nextInt();
        sc.close();

        Car car = new Car();
        car.drive(inputSpeed);
        car.displaySpeed();
    }
}

class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public void drive(int increase) {
        this.speed += increase;
        if (this.speed > 200) {
            this.speed = 200;
        }
    }

    public void displaySpeed() {
        System.out.println(this.speed);
    }
}
