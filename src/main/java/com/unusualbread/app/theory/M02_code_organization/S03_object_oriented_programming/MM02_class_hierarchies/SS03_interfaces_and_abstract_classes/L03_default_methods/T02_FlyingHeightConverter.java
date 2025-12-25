package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L03_default_methods;

/*
There is an interface Flying that has a method getHeight returning the height
of flying in meters. Add and implement a default method getHeightInKm that
returns height of flying in kilometers.
*/

interface Flying {
    int getHeight();

    default int getHeightInKm() {
        return getHeight() / 1000;
    }
}
