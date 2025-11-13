package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
You are given a class Clock. It has two int fields: hours and minutes.
The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12.
The clock does not know whether it's day or night (no AM or PM).

Implement the method next that increases the value of minutes by 1.
The minutes must be reset to zero when the current hour ends.
Do not forget to change the hours as well.
*/

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        this.minutes++;

        if (this.minutes > 59) {
            this.minutes = 0;
            this.hours++;

            if (this.hours > 12) {
                this.hours = 1;
            }
        }
    }
}
