package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L01_localdate;

/*
Write a program that reads a year and three days of this year (by their
numbers) from the standard input and output all dates corresponding to these
numbers in the same order.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T01_DateByYearAndDaysPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        int[] dayNumbers = new int[3];
        for (int i = 0; i < dayNumbers.length; i++) {
            dayNumbers[i] = sc.nextInt();
        }

        for (int dayNumber : dayNumbers) System.out.println(LocalDate.ofYearDay(year, dayNumber));
    }
}
