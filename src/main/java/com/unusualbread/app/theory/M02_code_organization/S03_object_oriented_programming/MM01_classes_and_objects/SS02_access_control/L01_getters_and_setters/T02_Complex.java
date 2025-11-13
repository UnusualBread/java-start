package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L01_getters_and_setters;

/*
Here's a class named Complex with two double fields, real and imaginary.
Write getters and setters for both fields.
*/

class Complex {

    private double real;
    private double imaginary;

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }
}