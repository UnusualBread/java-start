package theory.M05_additional_instruments.S01_essential_standard_classes.MM03_date_and_time.L01_localdate;

/*
Write a Java program that accepts a date in 'YYYY-MM-DD' format and prints
'true' if the year of the registered date is a leap year, otherwise 'false'.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class T12_LeapYearChecker {
    public static void main(String[] args) {
        System.out.println(LocalDate.parse(new Scanner(System.in).nextLine()).isLeapYear());
    }
}
