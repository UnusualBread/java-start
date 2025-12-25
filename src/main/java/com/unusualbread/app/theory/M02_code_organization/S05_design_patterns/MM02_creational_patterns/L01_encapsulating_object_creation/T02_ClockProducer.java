package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L01_encapsulating_object_creation;

/*
Implement the method produce of the factory. It should return a clock according
to the specified type string:

"SAND" is for SandClock;
"DIGITAL" is for DigitalClock;
"MECH" is for MechanicalClock.

The single constructor of the factory takes the boolean parameter
produceToyClock. It determines what the factory does when an unsuitable type of
clock is passed. If it is true, the factory should produce an instance of
ToyClock, otherwise, return null.
*/

import java.util.Scanner;

class ClockFactory {

    private boolean produceToyClock;

    public ClockFactory(boolean produceToyClock) {
        this.produceToyClock = produceToyClock;
    }

    public Clock produce(String type) {
        return switch (type) {
            case "SAND" -> new SandClock();
            case "DIGITAL" -> new DigitalClock();
            case "MECH" -> new MechanicalClock();
            default -> produceToyClock ? new ToyClock() : null;
        };
    }
}

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

class ToyClock implements Clock {

    @Override
    public void tick() {
        System.out.println("...tick...");
    }
}

public class T02_ClockProducer {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.next();
        final boolean produceToy = scanner.nextBoolean();
        final ClockFactory factory = new ClockFactory(produceToy);
        final Clock clock = factory.produce(type);
        if (clock == null) {
            System.out.println(clock);
        } else {
            clock.tick();
        }
    }
}
