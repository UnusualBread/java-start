package C02_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
Write a program that reads four integer numbers from one line and prints
them each in a new line. In the input line, numbers are separated
by one or more spaces.
*/

public class T06_LinesOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        int fourthNumber = sc.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);

        sc.close();
    }
}
