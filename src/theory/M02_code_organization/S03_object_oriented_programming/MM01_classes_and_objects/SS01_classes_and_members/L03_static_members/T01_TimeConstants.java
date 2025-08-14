package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L03_static_members;

/*
In this exercise, you will work with the TimeConstants class that stores
several time constants for seconds. You need to add two static fields
SECONDS_IN_DAY and SECONDS_IN_WEEK and print them in this order, each of them
on a new line.
*/

class TimeConstantsDemo {

    public static void main(String[] args) {
        System.out.println(TimeConstants.SECONDS_IN_DAY);
        System.out.println(TimeConstants.SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    public static final int SECONDS_IN_DAY = 24 * SECONDS_IN_HOUR;
    public static final int SECONDS_IN_WEEK = 7 * SECONDS_IN_DAY;
    private TimeConstants() { }
}
