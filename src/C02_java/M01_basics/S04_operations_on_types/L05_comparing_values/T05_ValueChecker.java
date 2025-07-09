package C02_java.M01_basics.S04_operations_on_types.L05_comparing_values;

import java.util.Scanner;

/*
Write a program that reads a value and checks if it is less than 10.
It should print true if it is less than 10 or false otherwise.
*/

public class T05_ValueChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println(value < 10);

        scanner.close();
    }
}
