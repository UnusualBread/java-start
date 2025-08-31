package projects.D04_challenging.P01_bulls_and_cows.duel.controller;

import projects.D04_challenging.P01_bulls_and_cows.duel.player.Player;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);

    public void startGame() {
        String name1 = getName(1);
        String name2 = getName(2);

        Player player1 = new Player(name1, name2);
        Player player2 = new Player(name2, name1);

        player1.setOpponent(player2);
        player2.setOpponent(player1);

        setCode(player1);
        clearScreen();
        setCode(player2);
        clearScreen();
        
        printStartString();

        runGame(player1, player2);

        printResult(player1, player2);
    }

    private void clearScreen() {
        for (int i = 0; i < 1000; ++i) System.out.println();
    }

    private void runGame(Player player1, Player player2) {
        while (!isEnd(player1, player2)) {
            player1.playAttempt();
            player2.playAttempt();
        }
    }

    private static void printResult(Player player1, Player player2) {
        if (player1.getIsWinner() && player2.getIsWinner()) System.out.println("Draw!");
        else if (player1.getIsWinner()) System.out.printf("%s won in %d!", player1.getName(), player1.getTurns());
        else System.out.printf("%s won in %d moves!", player2.getName(), player2.getTurns() - 1);
    }

    private boolean isEnd(Player player1, Player player2) {
        return player1.getIsWinner() || player2.getIsWinner();
    }

    private String getName(int playerNumber) {
        System.out.printf("Enter the name of the %s player:\n", playerNumber == 1 ? "first" : "second");
        return sc.nextLine();
    }

    private void setCode(Player player) {
        System.out.println("Preparing for the game...");
        player.readCodeLength();
        player.setCodeToGuess();
    }

    private void printStartString() {
        System.out.println("""
                Everyone is ready...
                Let's play!
                """);
    }
}
