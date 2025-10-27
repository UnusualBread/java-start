package projects.D04_challenging.P03_battleship.battleship.game;

import projects.D04_challenging.P03_battleship.battleship.controller.Controller;

import java.util.Scanner;

public class Game {
    private final Player player1;
    private final Player player2;
    private final Controller controller = new Controller();

    public Game() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    public void start() {
        prepareBoards();

        while (true) {
            if (makeMove(player1, player2)) break;
            pressEnterToContinue();
            if (makeMove(player2, player1)) break;
            pressEnterToContinue();
        }
    }

    private boolean makeMove(Player player, Player opponent) {
        printDisplay(player, opponent);
        takeShot(player, opponent);
        return opponent.allShipsSunk();
    }

    private void printDisplay(Player player, Player opponent) {
        opponent.printFogBoard();
        System.out.println("-".repeat(21));
        player.printBoard();
    }

    private void prepareBoards() {
        preparePlayerBoard(player1);
        pressEnterToContinue();
        preparePlayerBoard(player2);
        pressEnterToContinue();
    }

    private void pressEnterToContinue() {
        System.out.println("\nPress Enter and pass the move to another player");
        new Scanner(System.in).nextLine();
        clearScreen();
    }

    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private void takeShot(Player player, Player opponent) {
        System.out.printf("\n%s, it's your turn:\n\n", player.getName());
        int[] shotCords = controller.getShotCords();
        printShotResult(player, shotCords, opponent);
    }

    private static void printShotResult(Player player, int[] shotCords, Player opponent) {
        if (player.shoot(shotCords, opponent)) {
            if (opponent.allShipsSunk()) System.out.println("\nYou sank the last ship. You won. Congratulations!\n");
            else if (opponent.checkIfShipSunk()) System.out.println("\nYou sank a ship! Specify a new target:\n");
            else System.out.print("\nYou hit a ship!");
        } else {
            System.out.print("\nYou missed!");
        }
    }

    private void preparePlayerBoard(Player player) {
        System.out.printf("%s, place your ships on the game field\n\n", player.getName());
        player.printBoard();
        placeAllShips(player);
    }

    private void placeAllShips(Player player) {
        for (ShipType shipType : ShipType.values()) {
            placeShip(player, shipType);
        }
    }

    private void placeShip(Player player, ShipType shipType) {
        boolean isFirstTry = true;
        while (true) {
            int[][] shipEnds = controller.getShipEnds(shipType, isFirstTry);
            Ship ship = new Ship(shipType, shipEnds);
            if (!player.canPlaceShip(ship)) {
                System.out.println("Error! You placed it too close to another one. Try again:\n");
                isFirstTry = false;
                continue;
            }
            player.placeShip(ship);
            player.printBoard();
            break;
        }
    }
}
