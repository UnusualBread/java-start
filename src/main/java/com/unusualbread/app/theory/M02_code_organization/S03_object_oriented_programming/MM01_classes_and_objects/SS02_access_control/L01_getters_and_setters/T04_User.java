package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L01_getters_and_setters;

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null || firstName.isEmpty() ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null || lastName.isEmpty() ? "" : lastName;
    }

    public String getFullName() {
        return firstName.isEmpty() && lastName.isEmpty() ? "Unknown" : firstName.isEmpty() || lastName.isEmpty() ? firstName + lastName : firstName + " " + lastName;
    }
}
