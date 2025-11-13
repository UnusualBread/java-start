package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that subtracts N hours and adds M minutes to a date-time pair.
*/

import java.time.LocalDateTime;
import java.util.Scanner;

public class T02_DateTimePointCalculator_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        System.out.println(dateTime.minusHours(hours).plusMinutes(minutes));
    }
}
