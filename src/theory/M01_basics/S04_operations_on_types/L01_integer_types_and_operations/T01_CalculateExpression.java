package theory.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
Write a program that reads an integer value n from the standard
input and outputs the result of the following arithmetic expression:
((n + 1) * n + 2) * n + 3
*/

public class T01_CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = ((n + 1) * n + 2) * n + 3;

        System.out.print(result);

        scanner.close();
    }
}
