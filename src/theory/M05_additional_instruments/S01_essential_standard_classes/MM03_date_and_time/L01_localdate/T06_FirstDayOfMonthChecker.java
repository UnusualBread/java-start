package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that reads a year and the order number of a day, and checks if
this day is the first day of a month or not.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T06_FirstDayOfMonthChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int day = sc.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, day);

        System.out.println(date.getDayOfMonth() == 1);
    }
}
