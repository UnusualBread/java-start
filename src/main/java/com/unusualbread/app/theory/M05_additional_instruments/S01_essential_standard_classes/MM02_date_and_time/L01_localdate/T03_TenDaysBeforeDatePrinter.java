package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L01_localdate;

/*
Write a program that reads a date from the standard input and prints a date
that is 10 days before.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T03_TenDaysBeforeDatePrinter {
    public static void main(String[] args) {
        System.out.println(LocalDate.parse(new Scanner(System.in).nextLine()).minusDays(10));
    }
}
