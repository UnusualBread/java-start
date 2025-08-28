package projects.D04_challenging.P01_bulls_and_cows.duel.player;

import java.util.Scanner;

public class Player {
    private final String name;
    private final String opponentName;
    private int bullsCount;
    private int cowsCount;
    private int turns;
    private Player opponent;
    private boolean isWinner;
    private String codeToGuess;
    private String attempt;
    private int codeLength;
    private final Scanner scanner = new Scanner(System.in);

    public Player(String name, String opponentName) {
        this.name = name;
        this.opponentName = opponentName;
        this.bullsCount = 0;
        this.cowsCount = 0;
        this.turns = 1;
        this.isWinner = false;
    }

    public void readCodeLength() {

        while (true) {
            System.out.printf("%s, enter the length of the secret code for %s:\n", name, opponentName);
            String input = scanner.nextLine();
            try {
                codeLength = Integer.parseInt(input);
                if (codeLength > 10) {
                    System.out.println("Error: maximum length of the secret code is 10.");
                    continue;
                }
                if (codeLength < 1) {
                    System.out.println("Error: minimum length of the secret code is 1.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.printf("Error: \"%s\" isn't a valid number.\n", input);
            }
        }
    }

    public void setCodeToGuess() {
        String input;

        while (true) {
            System.out.printf("%s, enter the secret code for %s:\n", name, opponentName);
            input = scanner.nextLine();
            try {
                Integer.parseInt(input);
                if (input.length() != codeLength) {
                    System.out.printf("Error: \"%s\"'s length is not equal to %d.\n", input, codeLength);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: the secret code can contain only digits.");
            }
        }
        opponent.codeToGuess = input;
    }

    public void playAttempt() {
        bullsCount = 0;
        cowsCount = 0;
        askAttempt();
        gradeAttempt();
        printGrade();
        isWinner = bullsCount >= codeLength;
        turns++;
    }

    private void askAttempt() {
        while (true) {
            System.out.printf("%s's turn %d:\n", name, turns);
            attempt = scanner.nextLine();
            if (attempt.length() != codeLength) {
                System.out.printf("Error: answer's length (%d) is not equals to secret code's length (%d).\n", attempt.length(), codeLength);
                continue;
            }

            boolean isError = false;

            for (int i = 0; i < attempt.length(); i++) {
                char chr = attempt.charAt(i);
                if (chr < '0' || chr > '9') {
                    System.out.printf("Error: \"%s\" contains symbols not from bounds of %s.\n", attempt, getCharsBound());
                    isError = true;
                    break;
                }
            }

            if (isError) continue;

            break;
        }

    }

    private String getCharsBound() {
        return codeLength == 1 ? "0" : "0-9";
    }

    private void gradeAttempt() {
        bullsCount = 0;
        cowsCount = 0;

        boolean[] codeUsed = new boolean[codeLength];
        boolean[] attemptUsed = new boolean[codeLength];

        for (int i = 0; i < codeLength; i++) {
            if (attempt.charAt(i) == codeToGuess.charAt(i)) {
                bullsCount++;
                codeUsed[i] = true;
                attemptUsed[i] = true;
            }
        }

        for (int i = 0; i < codeLength; i++) {
            if (attemptUsed[i]) continue; // уже bull

            for (int j = 0; j < codeLength; j++) {
                if (codeUsed[j]) continue; // уже bull
                if (attempt.charAt(i) == codeToGuess.charAt(j)) {
                    cowsCount++;
                    codeUsed[j] = true; // эта цифра уже учтена
                    break;
                }
            }
        }
    }


    private void printGrade() {
        System.out.printf("Grade: %s%s%s%s\n",
                bullsCount > 0 ? bullsCount > 1 ? "%d bulls".formatted(bullsCount) : "%d bull".formatted(bullsCount) : "",
                bullsCount > 0 && cowsCount > 0 ? " and " : "",
                cowsCount > 0 ? cowsCount > 1 ? "%d cows".formatted(cowsCount) : "%d cow".formatted(cowsCount) : "",
                bullsCount == 0 && cowsCount == 0 ? "None" : ""
        );
    }

    public boolean getIsWinner() {
        return isWinner;
    }

    public String getName() {
        return name;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public int getTurns() {
        return turns;
    }
}