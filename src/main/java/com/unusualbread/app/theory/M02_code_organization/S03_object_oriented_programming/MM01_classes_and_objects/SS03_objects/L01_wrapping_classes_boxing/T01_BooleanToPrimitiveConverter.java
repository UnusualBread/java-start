package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS03_objects.L01_wrapping_classes_boxing;

/*
Implement the method toPrimitive(). It should take a value of Boolean type and
return a boolean. If the passed value is null, the result should be false.
*/

class Primitive {
    public static boolean toPrimitive(Boolean b) {
        return Boolean.TRUE.equals(b);
    }
}
