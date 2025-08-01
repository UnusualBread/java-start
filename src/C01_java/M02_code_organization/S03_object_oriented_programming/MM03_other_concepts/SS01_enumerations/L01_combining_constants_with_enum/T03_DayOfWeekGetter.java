package C01_java.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L01_combining_constants_with_enum;

/*
Create an enum called Weekday with constants for MONDAY, TUESDAY, WEDNESDAY,
THURSDAY, FRIDAY, SATURDAY and SUNDAY. Each enum constant should have an
associated integer value representing the day of the week (e.g., MONDAY=1,
TUESDAY=2, etc.). Write a program that prompts the user to enter a day of the
week as an integer (1-7) and prints the corresponding enum constant name.
*/

import java.util.Scanner;

public class T03_DayOfWeekGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        Weekday day = Weekday.values()[dayNumber - 1];
        System.out.println(day);
    }
}

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
