package C01_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

/*
Write a program that finds the tens digit in a non-negative integer.
*/

import java.util.Scanner;

public class T09_TensDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number / 10 % 10);

        sc.close();
    }
}
