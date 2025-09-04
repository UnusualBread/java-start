package projects.D04_challenging.P03_battleship.battleship.controller;

import projects.D04_challenging.P03_battleship.battleship.game.ShipType;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private ShipType shipType;
    private int firstLetter;
    private int secondLetter;
    private int firstNumber;
    private int secondNumber;
    private boolean isFirstTry;

    public int[] getShotCords() {
        int[] shotCords;
        do {
            String input = askInput(true);
            System.out.println();
            this.isFirstTry = false;
            shotCords = parseShotCords(input);
        } while (validateShotCords(shotCords));
        return shotCords;
    }

    private int[] parseShotCords(String input) {
        int[] shotCords = new int[2];
        char row = input.charAt(0);
        int col = Integer.parseInt(input.substring(1));
        shotCords[0] = row -'A';
        shotCords[1] = col - 1;
        return shotCords;
    }

    private boolean validateShotCords(int[] shotCords) {
        if (shotCords[0] < 0 || shotCords[0] > 9 || shotCords[1] < 0 || shotCords[1] > 9) {
            System.out.println("Error! You entered the wrong coordinates! Try again:\n");
            return true;
        }
        return false;
    }

    public int[][] getShipEnds(ShipType shipType, boolean isFirstTry) {
        this.shipType = shipType;
        this.isFirstTry = isFirstTry;
        int[][] shipEnds;
        do {
            String input = askInput(false);
            System.out.println();
            this.isFirstTry = false;
            String[] cordPairs = parseCordPairs(input);
            shipEnds = parseShipEnds(cordPairs);
            setCords(shipEnds);
        } while (validateShipEnds());
        this.isFirstTry = true;
        return shipEnds;
    }

    private String askInput(boolean isForShot) {
        if (isFirstTry && !isForShot) System.out.printf("\nEnter the coordinates of the %s (%d cells):\n\n", shipType.getName(), shipType.getSize());
        return scanner.nextLine();
    }

    private String[] parseCordPairs(String input) {
        return input.trim().split("\\s+");
    }

    private int[][] parseShipEnds(String[] cordPairs) {
        int[][] shipEnds = new int[2][2];
        for (int i = 0; i < 2; i++) {
            String cord = cordPairs[i];
            char row = cord.charAt(0);
            int col = Integer.parseInt(cord.substring(1));
            shipEnds[i][0] = row -'A';
            shipEnds[i][1] = col - 1;
        }
        return shipEnds;
    }

    private void setCords(int[][] shipEnds) {
        firstLetter = shipEnds[0][0];
        secondLetter = shipEnds[1][0];
        firstNumber = shipEnds[0][1];
        secondNumber = shipEnds[1][1];
    }

    public boolean validateShipEnds() {
        return isInvalidLocation() || isInvalidLength();
    }

    private boolean isInvalidLength() {
        if (getShipLength() != shipType.getSize()) {
            System.out.printf("Error! Wrong length of the %s! Try again:\n\n", shipType.getName());
            return true;
        }
        return false;
    }

    private boolean isInvalidLocation() {
        if (firstLetter != secondLetter && firstNumber != secondNumber || firstLetter < 0 || firstLetter > 9 || secondLetter < 0 || secondLetter > 9 || firstNumber < 0 || firstNumber > 9 || secondNumber < 0 || secondNumber > 9) {
            System.out.println("Error! Wrong ship location! Try again:\n");
            return true;
        }
        return false;
    }

    public int getShipLength() {
        return Math.max(Math.abs(secondLetter - firstLetter), Math.abs(secondNumber - firstNumber)) + 1;
    }
}
