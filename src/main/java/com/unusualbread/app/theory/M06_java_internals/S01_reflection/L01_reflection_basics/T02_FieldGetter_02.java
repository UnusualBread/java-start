package com.unusualbread.app.theory.M06_java_internals.S01_reflection.L01_reflection_basics;

/*
Implement the getNumberOfAccessibleFields method to count the number of
accessible public fields of the class or interface represented by the clazz
object.
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

class T02_FieldGetter_02 {

    public int getNumberOfAccessibleFields(Class<?> clazz) {
        return clazz.getFields().length;
    }
}
