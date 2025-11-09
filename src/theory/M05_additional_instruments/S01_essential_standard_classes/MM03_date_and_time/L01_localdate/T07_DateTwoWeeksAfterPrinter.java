package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a program that reads a date from the standard input and prints a date
that is 2 weeks after.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T07_DateTwoWeeksAfterPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.println(date.plusWeeks(2));
    }
}
