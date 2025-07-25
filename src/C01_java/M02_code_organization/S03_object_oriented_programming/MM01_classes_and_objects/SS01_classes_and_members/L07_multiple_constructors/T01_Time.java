package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L07_multiple_constructors;

/*
Here's a class named Time with three fields: hours, minutes and seconds.
Add three constructors to the class:
    The first one takes only hours and initializes this field;
    The second one takes hours and minutes and initializes the corresponding
    fields;
    The third one takes hours, minutes and seconds and initializes all fields.
*/

class Time {

    int hours;
    int minutes;
    int seconds;

    Time(int hours) {
        this.hours = hours;
    }

    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
