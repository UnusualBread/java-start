package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L02_factory_method;

/*
Provide the RobotGuardian class and implement a factory method in RobotFactory
methods to create Robot instances.
*/

import java.util.Scanner;

abstract class Robot2 {
    private int power;

    Robot2(int power) {
        this.power = power;
    }

    public abstract String getName();

    public abstract String getDescription();

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "robot: {\n\t" +
                "name : " + getName() + "\n\t" +
                "description : " + getDescription() + "\n\t" +
                "power : " + getPower() + "\n}";
    }
}

enum RobotType2 {
    ROBOT_CLEANER,
    ROBOT_GUARDIAN
}

class RobotCleaner2 extends Robot2 {
    private String name;
    private String description;

    public RobotCleaner2(String name, String description, int power) {
        super(power);
        this.name = name;
        this.description = description;
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
    public String toString() {
        return "cleaner-" + super.toString();
    }

}

class RobotGuardian2 extends Robot2 {
    private String name;
    private String description;

    public RobotGuardian2(String name, String description, int power) {
        super(power);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "guardian-" + super.toString();
    }
}

class RobotFactory2 {

    public Robot2 getRobot(RobotType2 type, String name, String description, int power) {
        return switch (type) {
            case ROBOT_CLEANER -> new RobotCleaner2(name, description, power);
            case ROBOT_GUARDIAN -> new RobotGuardian2(name, description, power);
        };
    }
}

class RobotDemo2 {
    private static final int CLEANER_POWER = 100;
    private static final int GUARDIAN_POWER = 200;

    public static void main(String[] args) {

        RobotFactory2 robotFactory2 = new RobotFactory2();
        Scanner scanner = new Scanner(System.in);

        String nameCleaner = scanner.nextLine();
        Robot2 robotCleaner = robotFactory2.getRobot(RobotType2.ROBOT_CLEANER, nameCleaner,
                "Robot will clean my room and dry my socks",
                CLEANER_POWER);

        String nameGuardian = scanner.nextLine();
        Robot2 robotGuardian = robotFactory2.getRobot(RobotType2.ROBOT_GUARDIAN, nameGuardian,
                "Knight will guard my daughter while she is sleeping",
                GUARDIAN_POWER);

        System.out.println(robotCleaner);
        System.out.println(robotGuardian);

        scanner.close();
    }
}