package theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that reads date-time, adds 11 hours to it and then prints out
the resulting date.
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class T03_DateAfterElevenHoursPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        LocalDate date = dateTime.plusHours(11).toLocalDate();
        System.out.println(date);
    }
}
