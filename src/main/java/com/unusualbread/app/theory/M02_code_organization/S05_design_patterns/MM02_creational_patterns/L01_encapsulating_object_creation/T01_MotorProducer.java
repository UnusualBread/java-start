package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L01_encapsulating_object_creation;

/*
Implement the static method make of the MotorStaticFactory that produces motors
of different types. The method takes three parameters: the type of a motor as a
character, model as a string, and power as a long number. It should return a
new motor according to the type with initialized fields.
*/

import java.util.Scanner;

class MotorStaticFactory {

    public static Motor make(char type, String model, long power) {
        return switch (Character.toLowerCase(type)) {
            case 'p' -> new PneumaticMotor(model, power);
            case 'h' -> new HydraulicMotor(model, power);
            case 'e' -> new ElectricMotor(model, power);
            case 'w' -> new WarpDrive(model, power);
            default -> null;
        };
    }
}

class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }
}

class PneumaticMotor extends Motor {

    public PneumaticMotor(String model, long power) {
        super(model, power);
    }
}

class HydraulicMotor extends Motor {

    public HydraulicMotor(String model, long power) {
        super(model, power);
    }
}

class ElectricMotor extends Motor {

    public ElectricMotor(String model, long power) {
        super(model, power);
    }
}

class WarpDrive extends Motor {

    public WarpDrive(String model, long power) {
        super(model, power);
    }
}

public class T01_MotorProducer {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        final Motor motor = MotorStaticFactory.make(type, model, power);
        if (motor == null) {
            System.out.println(motor);
        } else {
            System.out.println(motor.getClass().getName() + " " + motor.model + " " + motor.power);
        }
    }
}
