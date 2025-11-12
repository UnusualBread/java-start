package theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L02_localtime;

/*
Implement a method that takes two instances of LocalTime and determines how
many seconds are between them.
*/

import java.time.LocalTime;
import java.util.Scanner;

public class T02_BetweenSecondsCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(sc.nextLine());
        LocalTime time2 = LocalTime.parse(sc.nextLine());
        System.out.println(Math.abs(time2.toSecondOfDay() - time1.toSecondOfDay()));
    }
}
