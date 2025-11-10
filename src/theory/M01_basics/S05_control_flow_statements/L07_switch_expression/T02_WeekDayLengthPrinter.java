package theory.M01_basics.S05_control_flow_statements.L07_switch_expression;

/*
Rewrite the following switch statement as a switch expression using the code
template below. Feel free to assign numLetters to whatever you wish, but do not
alter the other code.
*/

import java.util.Scanner;

enum DaysOfTheWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

class T02_WeekDayLengthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(scanner.next());

        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case SATURDAY, THURSDAY -> 8;
            case WEDNESDAY -> 9;
        };

        System.out.println(numLetters);
    }
}
