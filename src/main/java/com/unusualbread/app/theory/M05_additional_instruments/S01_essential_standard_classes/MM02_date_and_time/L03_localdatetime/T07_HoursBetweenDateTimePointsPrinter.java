package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that calculates how many whole hours are between the two
date-time pairs of the same year.
*/

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class T07_HoursBetweenDateTimePointsPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime1 = LocalDateTime.parse(sc.nextLine());
        LocalDateTime dateTime2 = LocalDateTime.parse(sc.nextLine());

        System.out.println(Math.abs(Duration.between(dateTime1, dateTime2).toHours()));
    }
}
