package com.unusualbread.app.theory.M02_code_organization.S02_methods.L03_arrays_as_parameters;

/*
Write a method named getFirstAndLast. The method must take an array of ints and
return a new array of ints. The returned array must contain two elements: the
first and the last elements of the input array.
It is guaranteed that the input array always has at least one element.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T06_FirstAndLastGetter {

    // write a method here
    public static int[] getFirstAndLast(int[] arr) {
        int[] newArr = new int[2];
        if (arr.length == 1) {
            newArr[0] = arr[0];
            newArr[1] = arr[0];
            return newArr;
        }

        newArr[0] = arr[0];
        newArr[1] = arr[arr.length - 1];

        return newArr;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
