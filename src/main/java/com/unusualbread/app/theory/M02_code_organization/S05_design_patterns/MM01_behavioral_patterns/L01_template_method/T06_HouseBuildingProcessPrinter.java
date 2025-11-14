package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L01_template_method;

/*
You must implement the abstract class House with a template method called
build() to build a new house using the following algorithm:

Choose a location
Place a foundation
Place walls
Place windows
Place doors
Place roofs
Connect the house to the electrical grid
*/

import java.util.Scanner;

abstract class House {

    public void build() {
        chooseLocation();

        placeFoundations();

        placeWalls();

        placeWindows();

        placeDoors();

        placeRoofs();

        connectElectricity();
    }

    public abstract void placeFoundations();

    public abstract void placeDoors();

    public abstract void placeWindows();

    public abstract void placeWalls();

    public void chooseLocation() {
        System.out.println("Choose the best location for the new house");
    }

    public void placeRoofs() {
        System.out.println("Place metal sheet roofs");
    }

    public void connectElectricity() {
        System.out.println("Connect the house to the electrical grid");
    }
}

class Wooden extends House {

    @Override
    public void placeFoundations() {
        System.out.println("Place a wooden foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place wooden walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place wooden windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place wooden doors");
    }
}

class Stone extends House {

    @Override
    public void placeFoundations() {
        System.out.println("Place a stone foundation");
    }

    @Override
    public void placeWalls() {
        System.out.println("Place stone walls");
    }

    @Override
    public void placeWindows() {
        System.out.println("Place reinforced windows");
    }

    @Override
    public void placeDoors() {
        System.out.println("Place reinforced doors");
    }
}

class T06_HouseBuildingProcessPrinter {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        House house = null;
        if ("wooden".equalsIgnoreCase(type)) {
            house = new Wooden();
        } else if ("stone".equalsIgnoreCase(type)) {
            house = new Stone();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        house.build();
    }
}
