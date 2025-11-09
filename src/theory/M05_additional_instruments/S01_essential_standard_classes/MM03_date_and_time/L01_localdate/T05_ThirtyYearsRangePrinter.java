package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that reads a date from the standard input and prints two dates:
30 years before and after compared to the given date.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T05_ThirtyYearsRangePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println(date.minusYears(30) + "\n" + date.plusYears(30));
    }
}
