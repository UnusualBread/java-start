package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that reads a date from the standard input and output the
following information on it:

1) number of the day in the year;

2) the number of the day in the month.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T08_DayInYearAndMonthPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}
