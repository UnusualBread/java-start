package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L01_localdate;

/*
Write a program that prints the n-th day from the end of a month.

The program must read the year, the month, and the remaining number of days
till the end of the month from standard input and then output the date.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T11_NthDayFromEndOfMonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int dayNumber = sc.nextInt();

        LocalDate startDate = LocalDate.of(year, month, 1);
        int day = startDate.lengthOfMonth() - dayNumber + 1;

        System.out.println(LocalDate.of(year, month, day));
    }
}
