package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L02_localtime;

/*
Write a program that reads a point in time and prints another point in time at
the specified number of hours and minutes before the given one.
*/

import java.time.LocalTime;
import java.util.Scanner;

public class T01_TimePointBeforeCalculator {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LocalTime time = LocalTime.parse(input);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        System.out.println(time.minusHours(hours).minusMinutes(minutes));
    }
}
