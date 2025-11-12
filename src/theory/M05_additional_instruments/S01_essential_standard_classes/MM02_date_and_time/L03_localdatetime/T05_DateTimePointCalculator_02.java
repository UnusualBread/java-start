package theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that changes the given point of time: adds a certain number of
days and subtracts a few hours.
*/

import java.time.LocalDateTime;
import java.util.Scanner;

public class T05_DateTimePointCalculator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.next());
        int days = sc.nextInt();
        int hours = sc.nextInt();

        System.out.println(dateTime.plusDays(days).minusHours(hours));
    }
}
