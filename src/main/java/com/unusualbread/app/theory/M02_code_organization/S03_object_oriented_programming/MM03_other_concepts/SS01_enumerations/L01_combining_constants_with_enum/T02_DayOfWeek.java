package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L01_combining_constants_with_enum;

/*
Declare an enum named DayOfWeek. It should include all days of the week in
uppercase: SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY.
*/

enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class T02_DayOfWeek {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}
