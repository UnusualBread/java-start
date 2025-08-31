package projects.D04_challenging.P01_bulls_and_cows.classic.controller;

import java.util.Random;
import java.util.Scanner;

public class BullsAndCowsGame {
    private static int codeLength;
    private static int symbolsNumber;
    private String code;
    private String attempt;
    private int bullsCount;
    private int cowsCount;
    private int turn = 0;
    private Scanner scanner;
    private Random random;

    public void startGame() {
        scanner = new Scanner(System.in);
        if (!askCodeLength() || !askSymbolsNumber()) return;
        generateRandomCodeNumber();
        printStartString();
        playAttempt();
    }

    private void printStartString() {
        String charsBound = getCharsBound();
        System.out.printf("""
                The secret is prepared: %s (%s).
                Okay, let's start a game!
                """, "*".repeat(codeLength), charsBound);
    }

    private String getCharsBound() {
        String charsBound;
        switch (symbolsNumber) {
            case 1 -> charsBound = "0";
            case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> charsBound = "%c-%c".formatted('0', (char) ('0' + symbolsNumber - 1));
            case 11 -> charsBound = "%c-%c, %c".formatted('0', '9', 'a');
            default -> charsBound = "%c-%c, %c-%c".formatted('0', '9', 'a', (char) ('a' + symbolsNumber - 11));
        }
        return charsBound;
    }

    private boolean askSymbolsNumber() {
        return readSymbolsNumber() && isValidSymbolsNumber();
    }

    private boolean isValidSymbolsNumber() {
        if (symbolsNumber > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return false;
        }

        if (symbolsNumber < 1) {
            System.out.println("Error: minimum number of possible symbols in the code is 1 (0).");
            return false;
        }

        if (symbolsNumber < codeLength) {
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.\n", codeLength, symbolsNumber);
            return false;
        }
        return true;
    }

    private boolean readSymbolsNumber() {
        System.out.println("Input the number of possible symbols in the code:");
        String input = scanner.nextLine();
        try {
            symbolsNumber = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.printf("Error: \"%s\" isn't a valid number.\n", input);
            return false;
        }
    }

    private boolean askCodeLength() {
        return readCodeLength() && isValidCodeLength();
    }

    private void playAttempt() {
        while (bullsCount < codeLength) {
            turn++;
            bullsCount = 0;
            cowsCount = 0;
            if (!askAttempt()) return;
            gradeAttempt();
            printGrade();
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }

    private boolean askAttempt() {
        System.out.printf("Turn %d:\n", turn);
        attempt = scanner.nextLine();
        if (attempt.length() != codeLength) {
            System.out.printf("Error: answer's length (%d) is not equals to secret code's length (%d).\n", attempt.length(), codeLength);
            return false;
        }

        for (int i = 0; i < attempt.length(); i++) {
            char chr = attempt.charAt(i);
            if (chr < '0' || chr > '9' && chr < 'a' || chr > 'z' || chr > '0' + symbolsNumber - 1 && symbolsNumber <= 10 || chr > 'a' + symbolsNumber - 11) {
                System.out.printf("Error: \"%s\" contains symbols not from bounds of %s.\n", attempt, getCharsBound());
                return false;
            }
        }
        return true;
    }

    private boolean readCodeLength() {
        System.out.println("Input the length of the secret code:");
        String input = scanner.nextLine();
        try {
            codeLength = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.printf("Error: \"%s\" isn't a valid number.\n", input);
            return false;
        }
    }

    private boolean isValidCodeLength() {
        if (codeLength > 36) {
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.", codeLength);
            return false;
        }

        if (codeLength < 1) {
            System.out.println("Error: minimum length of the secret code is 1.");
            return false;
        }
        return true;
    }

    private void generateRandomCodeNumber() {
        StringBuilder sb = new StringBuilder();
        random = new Random(System.currentTimeMillis());

        while (sb.length() < codeLength) {
            char symbol = getRandomChar();

            while (sb.toString().contains(String.valueOf(symbol))) {
                symbol = getRandomChar();
            }

            sb.append(symbol);
        }
        code = sb.toString();
    }

    private char getRandomChar() {
        int step = random.nextInt(symbolsNumber);
        return (char) (step < 10 ? '0' + step : 'a' + (step - 10));
    }

    private void printGrade() {
        System.out.printf("Grade: %s%s%s%s\n",
                bullsCount > 0 ? bullsCount > 1 ? "%d bulls".formatted(bullsCount) : "%d bull".formatted(bullsCount) : "",
                bullsCount > 0 && cowsCount > 0 ? " and " : "",
                cowsCount > 0 ? cowsCount > 1 ? "%d cows".formatted(cowsCount) : "%d cow".formatted(cowsCount) : "",
                bullsCount == 0 && cowsCount == 0 ? "None" : ""
        );
    }

    private void gradeAttempt() {
        for (int i = 0; i < code.length(); i++) {
            if (attempt.charAt(i) == code.charAt(i)) bullsCount++;
            else {
                for (int j = 0; j < code.length(); j++) {
                    if (j == i) continue;
                    if (attempt.charAt(i) == code.charAt(j)) {
                        cowsCount++;
                        break;
                    }
                }
            }
        }
    }
}
