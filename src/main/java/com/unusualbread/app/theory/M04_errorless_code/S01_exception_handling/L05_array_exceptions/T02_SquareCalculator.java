package com.unusualbread.app.theory.M04_errorless_code.S01_exception_handling.L05_array_exceptions;

/*
You need to implement the calculateSquare method.
It should output the square of the element by the provided index of an array.
In the case when the exception might happen, your program output should be:
Exception!
*/

class T02_SquareCalculator {
    public static void calculateSquare(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            System.out.println("Exception!");
        } else {
            System.out.println((int) Math.pow(array[index], 2));
        }
    }
}
