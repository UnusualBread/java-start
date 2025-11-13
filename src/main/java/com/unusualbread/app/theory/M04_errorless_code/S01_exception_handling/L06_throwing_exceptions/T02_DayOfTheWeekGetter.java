package com.unusualbread.app.theory.M04_errorless_code.S01_exception_handling.L06_throwing_exceptions;

/*
Your task is to implement the getDayOfWeekName method that converts the number
of the day of the week to its short name. If the given number is incorrect, the
method should throw an IllegalArgumentException.
*/

import java.util.Scanner;

public class T02_DayOfTheWeekGetter {
    public static String getDayOfWeekName(int number) {
        return switch (number) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> throw new IllegalArgumentException();
        };
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
