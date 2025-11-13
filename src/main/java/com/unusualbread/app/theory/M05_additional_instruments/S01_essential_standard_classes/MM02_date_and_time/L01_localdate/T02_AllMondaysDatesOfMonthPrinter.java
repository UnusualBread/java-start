package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L01_localdate;

/*
Write a program that reads a year and the number of a month (1-12) and prints
the dates of all Mondays of this month in the correct order (from the first to
the last).
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class T02_AllMondaysDatesOfMonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate dateBegin = LocalDate.of(year, month, 1);
        LocalDate dateEnd = LocalDate.of(year, month, dateBegin.lengthOfMonth());

        for (; !dateBegin.isAfter(dateEnd); dateBegin = dateBegin.plusDays(1)) {
            if (dateBegin.getDayOfWeek().equals(DayOfWeek.MONDAY)) System.out.println(dateBegin);
        }
    }
}
