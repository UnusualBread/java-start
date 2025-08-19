package projects.D03_hard.P02_tic_tac_toe.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private enum GameStates {
        X_WON("X wins"),
        O_WON("O wins"),
        DRAW("Draw"),
        ONGOING("Game not finished"),
        IMPOSSIBLE("Impossible");

        private final String gameState;

        GameStates(String gameState) {
            this.gameState = gameState;
        }

        public String getGameState() {
            return gameState;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] field = getCellsArr();

        printFieldState(field);
        playGame(field, sc);
        sc.close();
    }

    private static void playGame(String[][] field, Scanner sc) {
        final int fieldSize = field.length;
        int moveNumber = 1;
        String gameState;

        do {
            String currentPlayer = moveNumber++ % 2 == 1 ? "X" : "O";
            gameState = doMove(sc, fieldSize, field, currentPlayer);
        } while (gameState.equals(GameStates.ONGOING.getGameState()));

        System.out.println(gameState);
    }

    private static String doMove(Scanner sc, int fieldSize, String[][] field, String currentPlayer) {
        int[] Coords = readCoords(sc, fieldSize, field);
        updateField(field, Coords[0], Coords[1], currentPlayer);
        printFieldState(field);
        return analyzeField(fieldSize, field);
    }

    private static String analyzeField(int fieldSize, String[][] field) {
        int[] xRows = new int[fieldSize];
        int[] xCols = new int[fieldSize];
        int[] oRows = new int[fieldSize];
        int[] oCols = new int[fieldSize];

        int xDiag1 = 0, xDiag2 = 0;
        int oDiag1 = 0, oDiag2 = 0;
        int xCount = 0, oCount = 0, _Count = 0;

        boolean xWon = false;
        boolean oWon = false;

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                String cell = field[i][j];

                if ("X".equals(cell)) {
                    xCount++;
                    xRows[i]++;
                    xCols[j]++;
                    if (i == j) xDiag1++;
                    if (i + j == fieldSize - 1) xDiag2++;
                } else if ("O".equals(cell)) {
                    oCount++;
                    oRows[i]++;
                    oCols[j]++;
                    if (i == j) oDiag1++;
                    if (i + j == fieldSize - 1) oDiag2++;
                } else {
                    _Count++;
                }

                xWon = xWon || checkIsWon(xRows, i, fieldSize, xCols, j, xDiag1, xDiag2);

                oWon = oWon || checkIsWon(oRows, i, fieldSize, oCols, j, oDiag1, oDiag2);
            }
        }

        return getGameState(xWon, oWon, xCount, oCount, _Count);
    }

    private static int[] readCoords(Scanner sc, int fieldSize, String[][] field) {
        int xCoord, yCoord;

        while (true) {
            try {
                xCoord = sc.nextInt();
                yCoord = sc.nextInt();

                if (areValidCoords(xCoord, fieldSize, yCoord, field)) continue;

                break;
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                sc.nextLine();
            }
        }

        return new int[] {xCoord, yCoord};
    }

    private static String getGameState(boolean xWon, boolean oWon, int xCount, int oCount, int _Count) {
        String gameState;
        if (xWon && oWon || xCount - oCount > 1 || xCount - oCount < -1) {
            gameState = GameStates.IMPOSSIBLE.getGameState();
        } else if (xWon) {
            gameState = GameStates.X_WON.getGameState();
        } else if (oWon) {
            gameState = GameStates.O_WON.getGameState();
        } else if (_Count == 0) {
            gameState = GameStates.DRAW.getGameState();
        } else {
            gameState = GameStates.ONGOING.getGameState();
        }
        return gameState;
    }

    private static boolean checkIsWon(int[] rows, int i, int fieldSize, int[] cols, int j, int diag1, int diag2) {
        return rows[i] == fieldSize || cols[j] == fieldSize ||  diag1 == fieldSize || diag2 == fieldSize;
    }

    private static boolean areValidCoords(int xCoord, int fieldSize, int yCoord, String[][] field) {
        if (xCoord < 1 || xCoord > fieldSize || yCoord < 1 || yCoord > fieldSize) {
            System.out.printf("Coordinates should be from 1 to %d!\n", fieldSize);
            return true;
        }

        if (!" ".equals(field[xCoord - 1][yCoord - 1])) {
            System.out.println("This cell is occupied! Choose another one!");
            return true;
        }
        return false;
    }

    private static void updateField(String[][] field, int xCoord, int yCoord, String cell) {
        field[xCoord - 1][yCoord - 1] = cell;
    }

    private static String[][] getCellsArr() {
        int fieldSize = 3;
        String[][] field = new String[fieldSize][fieldSize];

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = " ";
            }
        }

        return field;
    }

    private static void printFieldState(String[][] field) {
        System.out.println("-".repeat(9 + 2 * (field.length - 3)));
        for (String[] row : field) {
            System.out.print("| ");
            for (String cell : row) {
                System.out.print("_".equals(cell) ? "  " : cell + " ");
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(9 + 2 * (field.length - 3)));
    }
}
