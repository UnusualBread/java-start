package C01_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
Write a program that reads two integer numbers from the standard input
and outputs them in the reverse order separated by one space.
*/

public class T05_ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println(secondNumber + " " + firstNumber);

        sc.close();
    }
}
