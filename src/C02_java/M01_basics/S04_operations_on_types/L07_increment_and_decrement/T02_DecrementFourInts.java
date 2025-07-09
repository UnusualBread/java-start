package C02_java.M01_basics.S04_operations_on_types.L07_increment_and_decrement;

import java.util.Scanner;

/*
Write a program that reads four numbers and decrements each of them.
The program must output the results in the same order separated by spaces.
*/

public class T02_DecrementFourInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();
        int fourthDigit = scanner.nextInt();

        System.out.print(--firstDigit + " " + --secondDigit + " " +
                         --thirdDigit + " " + --fourthDigit);

        scanner.close();
    }
}
