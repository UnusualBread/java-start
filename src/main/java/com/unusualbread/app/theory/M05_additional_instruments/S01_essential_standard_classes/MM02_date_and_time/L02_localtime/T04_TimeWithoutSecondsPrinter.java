package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L02_localtime;

/*
Write a program that reads a point in time and outputs the same time without
seconds.
*/

import java.time.LocalTime;
import java.util.Scanner;

public class T04_TimeWithoutSecondsPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.nextLine());
        System.out.println(time.withSecond(0));
    }
}
