package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L02_factory_method;

/*
You have 4 types of motors: electric, hydraulic, pneumatic and warp drive.
You must implement MotorFactory and the specified classes of motors.
*/

import java.util.Scanner;

abstract class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "motor={model:" + model + ",power:" + power + "}";
    }
}

class PneumaticMotor extends Motor {
    PneumaticMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Pneumatic " + super.toString();
    }
}

class HydraulicMotor extends Motor {
    HydraulicMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Hydraulic " + super.toString();
    }
}

class ElectricMotor extends Motor {
    ElectricMotor(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Electric " + super.toString();
    }
}

class WarpDrive extends Motor {
    WarpDrive(String model, long power) {
        super(model, power);
    }

    @Override
    public String toString() {
        return "Warp " + super.toString();
    }
}

class MotorFactory {

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

public class T06_MotorFactory {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();

        Motor motor = MotorFactory.make(type, model, power);

        scanner.close();
        System.out.println(motor);
    }
}