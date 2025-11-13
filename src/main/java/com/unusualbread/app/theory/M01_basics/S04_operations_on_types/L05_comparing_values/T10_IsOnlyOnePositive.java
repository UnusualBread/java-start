package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a program that reads three integer numbers and
prints true if exactly ONE number is positive (i.e. > 0).
Otherwise, it should print false.
*/

import java.util.Scanner;

public class T10_IsOnlyOnePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        boolean isOnlyFirstPositive = firstNumber > 0 && secondNumber <= 0 && thirdNumber <= 0;
        boolean isOnlySecondPositive = firstNumber <= 0 && secondNumber > 0 && thirdNumber <= 0;
        boolean isOnlyThirdPositive = firstNumber <= 0 && secondNumber <= 0 && thirdNumber > 0;

        System.out.println(isOnlyFirstPositive || isOnlySecondPositive || isOnlyThirdPositive);

        sc.close();
    }
}
