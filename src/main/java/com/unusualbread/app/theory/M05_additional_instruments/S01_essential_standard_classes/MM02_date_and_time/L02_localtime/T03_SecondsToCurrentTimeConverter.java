package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L02_localtime;

/*
Write a program that reads a number of seconds from the start of a day and
prints the current time.
*/

import java.time.LocalTime;
import java.util.Scanner;

public class T03_SecondsToCurrentTimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        System.out.println(time);
    }
}
