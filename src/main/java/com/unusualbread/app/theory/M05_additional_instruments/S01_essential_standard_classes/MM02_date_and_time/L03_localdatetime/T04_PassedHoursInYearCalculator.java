package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that reads a date-time pair and calculates how many hours have
passed since the beginning of the year (1st January, 00:00).
*/

import java.time.LocalDateTime;
import java.util.Scanner;

public class T04_PassedHoursInYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        System.out.println((dateTime.getDayOfYear() - 1) * 24 + dateTime.getHour());
    }
}
