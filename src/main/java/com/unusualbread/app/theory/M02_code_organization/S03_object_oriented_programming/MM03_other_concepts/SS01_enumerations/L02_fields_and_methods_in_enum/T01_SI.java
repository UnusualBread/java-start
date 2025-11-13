package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L02_fields_and_methods_in_enum;

/*
You are given an enum SI with three constants. Each constant stores a string
field with its quantity name.
Declare the instance method getQuantityName that returns the quantity name of
the constant.
*/

enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    String getQuantityName() {
        return quantityName;
    }
}
