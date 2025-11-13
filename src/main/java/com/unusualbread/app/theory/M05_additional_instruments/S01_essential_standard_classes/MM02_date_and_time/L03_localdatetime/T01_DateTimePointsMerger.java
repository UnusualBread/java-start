package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM02_date_and_time.L03_localdatetime;

/*
Implement a method that takes two instances of LocalDateTime class and merges
them into one object by choosing the largest value of each component for the
target object.
*/

import java.time.LocalDateTime;
import java.util.Scanner;

public class T01_DateTimePointsMerger {
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        return LocalDateTime.of(
                Math.max(dateTime1.getYear(), dateTime2.getYear()),
                Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue()),
                Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth()),
                Math.max(dateTime1.getHour(), dateTime2.getHour()),
                Math.max(dateTime1.getMinute(), dateTime2.getMinute()),
                Math.max(dateTime1.getSecond(), dateTime2.getSecond())
        );
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}
