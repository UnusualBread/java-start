package projects.D03_hard.P01_last_pencil.player_vs_player_mode;

import java.util.Scanner;

public class Main {

    public static final String FIRST_PLAYER_NAME = "Artyom";
    public static final String SECOND_PLAYER_NAME = "Olya";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pencilCount = askStartPencilCount(sc);

        String playerName = askFirstPlayerName(sc);

        String lastPlayer = makeMove(pencilCount, playerName, sc);

        printWinner(lastPlayer);

        sc.close();
    }

    private static String makeMove(int pencilCount, String playerName, Scanner sc) {
        while (pencilCount > 0) {
            printGameState(pencilCount, playerName);
            pencilCount = getPencilCount(pencilCount, sc);
            playerName = switchPlayerName(playerName);
        }

        return playerName;
    }

    private static void printWinner(String playerName) {
        System.out.printf("%s won!\n", playerName);
    }

    private static int getPencilCount(int pencilCount, Scanner sc) {
        while (true) {
            String input = sc.next();

            try {
                int move = Integer.parseInt(input);

                if (move > pencilCount) {
                    System.out.println("Too many pencils were taken");
                    continue;
                }

                if (move >= 1 && move <= 3) {
                    return pencilCount -= move;
                } else {
                    System.out.println("Possible values: '1', '2' or '3'");
                }
            } catch (NumberFormatException e) {
                System.out.println("Possible values: '1', '2' or '3'");
            }
        }
    }

    private static void printGameState(int pencilCount, String playerName) {
        System.out.printf(getGameText(pencilCount, playerName));
    }

    private static String switchPlayerName(String playerName) {
        return FIRST_PLAYER_NAME.equals(playerName) ? SECOND_PLAYER_NAME : FIRST_PLAYER_NAME;
    }

    private static String askFirstPlayerName(Scanner sc) {
        System.out.printf("Who will be the first (%s, %s):\n", FIRST_PLAYER_NAME, SECOND_PLAYER_NAME);
        while (true) {
            String input = sc.next();

            if (FIRST_PLAYER_NAME.equals(input) || SECOND_PLAYER_NAME.equals(input)) {
                return input;
            } else {
                System.out.printf("Choose between '%s' and '%s'\n", FIRST_PLAYER_NAME, SECOND_PLAYER_NAME);
            }
        }
    }

    private static int askStartPencilCount(Scanner sc) {
        System.out.println("How many pencils would you like to use:");
        int pencilCount = 0;

        while (true) {
            String input = sc.next();

            try {
                pencilCount = Integer.parseInt(input);

                if (pencilCount > 0) {
                    return pencilCount;
                } else if (pencilCount == 0){
                    System.out.println("The number of pencils should be positive");
                } else {
                    System.out.println("The number of pencils should be numeric");
                }
            } catch (NumberFormatException e) {
                System.out.println("The number of pencils should be numeric");
            }
        }
    }

    private static String getGameText(int pencilCount, String playerName) {
        return """
                %s
                %s's turn:
                """.formatted("|".repeat(pencilCount), playerName);
    }
}
