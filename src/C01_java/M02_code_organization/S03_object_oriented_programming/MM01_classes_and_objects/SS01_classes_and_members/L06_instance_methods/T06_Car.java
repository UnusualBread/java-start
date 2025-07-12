package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
You want to create a program that models the behavior of cars.
For this purpose, you've created a class named Car containing three fields:
the int field yearModel, the string field make, and the int field speed.

You want to add functionality to your cars, so you need methods.
Add the following instance methods to your class:
    1. void accelerate() that adds 5 to the speed each time it's called;
    2. void brake() that subtracts 5 from the speed field each time it's called,
       the speed cannot be less than zero.
*/

class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 5;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
