package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L05_comparable;

/*
Implement the compareTo method. It should compare people by name, and if they
have the same name, compare them by age.
*/

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int result = name.compareTo(otherPerson.name);
        if (result != 0) {
            return result;
        }
        return Integer.compare(age, otherPerson.age);
    }
}
