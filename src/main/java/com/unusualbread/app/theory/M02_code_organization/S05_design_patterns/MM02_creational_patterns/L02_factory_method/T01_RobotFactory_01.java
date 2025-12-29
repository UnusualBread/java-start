package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L02_factory_method;

/*
The given classes are components of the Factory Method pattern.
Robot is the product and RobotCleaner is the concrete product.
Implement the factory method in RobotFactory methods to create RobotCleaner.
*/

import java.util.Scanner;

abstract class Robot {

    public abstract String getName();

    public abstract String getDescription();

    public abstract int getPower();

    @Override
    public String toString() {
        return "robot: {\n\t" +
                "name : " + getName() + "\n\t" +
                "description : " + getDescription() + "\n\t" +
                "power : " + getPower() + "\n}";
    }
}

enum RobotType {
    ROBOT_CLEANER
}

class RobotCleaner extends Robot {

    private String name;
    private String description;
    private int power;

    public RobotCleaner(String name, String description, int power) {
        this.name = name;
        this.description = description;
        this.power = power;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return "cleaner-" + super.toString();
    }

}

class RobotFactory {

    public Robot getRobot(RobotType type, String name, String description, int power) {
        return new RobotCleaner(name, description, power);
    }
}

class RobotDemo {
    public static void main(String[] args) {

        RobotFactory robotFactory = new RobotFactory();
        Scanner scanner = new Scanner(System.in);

        String nameCleaner = scanner.nextLine();

        Robot robotCleaner = robotFactory.
                getRobot(
                        RobotType.ROBOT_CLEANER,
                        nameCleaner,
                        "Robot will clean my room and dry my socks",
                        100);

        System.out.println(robotCleaner);

        scanner.close();
    }
}
