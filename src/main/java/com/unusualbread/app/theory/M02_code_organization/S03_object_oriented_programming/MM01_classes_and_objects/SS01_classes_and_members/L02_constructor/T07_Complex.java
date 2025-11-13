package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L02_constructor;

/*
Write a class named Complex. It must have two double fields real and imaginary
and a constructor to initialize the fields. The order of parameters in the
constructor must be the same as presented above.
*/

class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
