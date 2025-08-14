package theory.M01_basics.S06_strings.L01_string;

import java.util.Scanner;

/*
Write a program that reads two lines and compares them without whitespaces.
The program should print true if both lines are equal, otherwise – false.
*/

public class T02_CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();

        firstStr = firstStr.replace(" ", "");
        secondStr = secondStr.replace(" ", "");

        System.out.print(firstStr.equals(secondStr));

        scanner.close();
    }
}
