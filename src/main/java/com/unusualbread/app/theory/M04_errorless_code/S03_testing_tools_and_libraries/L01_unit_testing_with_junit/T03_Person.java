package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L01_unit_testing_with_junit;

class Person {
    public static final String DEFAULT_NAME = "Unknown";
    public static final int MAX_AGE = 130;
    public static final int MIN_AGE = 0;
    private String name;
    private int age;

    Person(String name, int age) {
        if (name == null || name.isBlank()) name = DEFAULT_NAME;

        if (age < MIN_AGE) age = MIN_AGE;
        else if (age > MAX_AGE) age = MAX_AGE;

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
