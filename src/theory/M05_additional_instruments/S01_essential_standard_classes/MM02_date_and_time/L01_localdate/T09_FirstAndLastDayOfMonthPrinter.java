package theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L01_localdate;

/*
Write a program that reads a year and a month and outputs the first and the
last day of this month.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T09_FirstAndLastDayOfMonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = LocalDate.of(year, month, startDate.lengthOfMonth());

        System.out.println(startDate + " " + endDate);
    }
}
