package theory.M04_errorless_code.S01_exception_handling.L06_throwing_exceptions;

/*
Modify the given method. It should throw an IOException.
*/

import java.io.IOException;

public class T03_ExceptionThrower_02 {

    // change this method
    public static void method() throws IOException {
        throw new IOException();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
