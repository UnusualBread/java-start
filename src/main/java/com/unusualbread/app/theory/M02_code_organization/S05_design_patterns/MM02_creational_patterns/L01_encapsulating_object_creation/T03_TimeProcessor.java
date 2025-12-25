package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM02_creational_patterns.L01_encapsulating_object_creation;

/*
Implement the following static factory methods of this class:

noon() returns an instance initialized with 12 hours, 0 minutes, and 0 seconds.

midnight() returns an instance initialized with 0 hours, 0 minutes, and 0 seconds.

of(int hour, int minute, int second) returns an instance initialized with
passed hour, minute and second if the passed arguments are correct (hour: 0-23,
minute: 0-59, seconds: 0-59), otherwise, null.

ofSeconds(long seconds) returns an instance initialized with seconds passed
since midnight; as an example, the invocation Time.ofSeconds(500000) must
create an instance with 18 hours, 53 minutes and 20 seconds (days are skipped);

*/

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    private Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time noon() {
        return new Time(12, 0, 0);
    }

    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        seconds %= 86400;
        int hour = (int) seconds / 3600;
        int minute = (int) seconds % 3600 / 60;
        int second = (int) seconds % 3600 % 60;
        return new Time(hour, minute, second);
    }

    public static Time of(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59)  {
            return null;
        }

        return new Time(hour, minute, second);
    }
}

public class T03_TimeProcessor {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}