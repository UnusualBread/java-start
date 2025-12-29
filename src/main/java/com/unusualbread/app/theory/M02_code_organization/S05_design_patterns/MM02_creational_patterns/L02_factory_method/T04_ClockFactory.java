package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L02_factory_method;

/*
The given classes are the Clock interface of products, specified clocks, and
the factory class ClockFactory to produce instances.

Your task is to implement the factory method produce. It should return a clock
according to the specified type string:

"Sand" — SandClock;
"Digital" — DigitalClock;
"Mechanical" — MechanicalClock.
*/

import java.util.Scanner;

interface Clock {
    void tick();
}

class SandClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...sand noise...");
    }
}

class DigitalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...pim...");
    }
}

class MechanicalClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...clang mechanism...");
    }
}

abstract class ClockFactory {

    abstract Clock createClock(String clockName);

    public Clock produce(String clockName) {
        Clock clock = createClock(clockName);
        if (clock == null) {
            System.out.println("Sorry, clock is not available\n");
            return null;
        }
        return clock;
    }
}

class ClockStore extends ClockFactory {

    @Override
    Clock createClock(String clockName) {
        return switch (clockName) {
            case "Sand" -> new SandClock();
            case "Digital" -> new DigitalClock();
            case "Mechanical" -> new MechanicalClock();
            default -> null;
        };
    }
}

public class T04_ClockFactory {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.next();
        final ClockStore clockStore = new ClockStore();
        final Clock clock = clockStore.produce(type);
        clock.tick();
        scanner.close();
    }
}
