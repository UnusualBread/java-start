package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L07_multiple_constructors;

/*
You are given a class named Movie. Write two constructors for the class.
The first constructor should take three arguments (title, desc, year) and
initialize the corresponding fields.
The second one should take only two arguments (title, year) and initialize
title and year. In this case, the field desc should have a value "empty".
*/

class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }

    Movie(String title, int year) {
        this.title = title;
        this.desc = "empty";
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}
