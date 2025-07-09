package C02_java.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

import java.util.Scanner;

/*
Given a sequence of positive integer numbers (which ends with the number 0).
Find the largest element of the sequence.
*/

public class T01_MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int max = 0;

        while (number != 0) {
            max = Math.max(number, max);
            number = scanner.nextInt();
        }

        System.out.println(max);

        scanner.close();
    }
}
