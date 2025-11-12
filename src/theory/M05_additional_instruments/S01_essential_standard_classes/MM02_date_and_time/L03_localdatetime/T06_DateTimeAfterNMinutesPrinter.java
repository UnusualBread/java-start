package theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Write a program that adds N minutes to a given date and time and prints out the
resulting year, day of the year, hours, minutes and seconds.

The input date-time should look like "2017-12-31T22:30:15", the result date
must be similar to "2018 139 19:50:15" (year, day of the year, hours, minutes, seconds).
*/

import java.time.LocalDateTime;
import java.util.Scanner;

public class T06_DateTimeAfterNMinutesPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        int minutesToAdd = sc.nextInt();

        LocalDateTime newDateTime = dateTime.plusMinutes(minutesToAdd);
        System.out.printf("%d %d %s\n",
                newDateTime.getYear(),
                newDateTime.getDayOfYear(),
                newDateTime.toLocalTime()
        );
    }
}
