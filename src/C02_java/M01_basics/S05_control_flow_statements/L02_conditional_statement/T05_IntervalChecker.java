package C02_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

import java.util.Scanner;

/*
Given an integer as an input, print True if its value falls within the interval
(−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case-sensitive).
*/

public class T05_IntervalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > -15 && number <= 12 || number > 14 && number < 17 || number >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}
