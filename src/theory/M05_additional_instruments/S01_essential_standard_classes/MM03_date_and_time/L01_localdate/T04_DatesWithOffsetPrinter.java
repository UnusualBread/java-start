package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that prints all dates of the given year with a specified offset
applied.

It should read a starting date and a value of an offset (in days).

In the output, dates should be printed in ascending order with the starting
date included. Do not output the dates from the next year.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T04_DatesWithOffsetPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.nextLine());
        int offset = sc.nextInt();
        int year = date.getYear();

        do {
            System.out.println(date);
            date = date.plusDays(offset);
        } while (date.getYear() == year);
    }
}
