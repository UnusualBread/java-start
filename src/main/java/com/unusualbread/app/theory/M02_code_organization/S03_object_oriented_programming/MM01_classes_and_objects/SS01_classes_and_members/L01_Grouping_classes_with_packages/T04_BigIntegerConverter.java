package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L01_Grouping_classes_with_packages;

/*
In this task, you will need to access this class without importing it.
Its constructor accepts only one argument: a string with a number
(for example, "1264"). It is located in the java.math package.
*/

class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number);
    }
}
