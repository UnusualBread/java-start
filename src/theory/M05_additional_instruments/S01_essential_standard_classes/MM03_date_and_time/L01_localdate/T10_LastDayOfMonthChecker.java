package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that reads a year and the number of a day in this year, and
checks if the day is the last day of a month or not.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T10_LastDayOfMonthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int day = sc.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, day);

        System.out.println(date.getDayOfMonth() == date.lengthOfMonth());
    }
}
