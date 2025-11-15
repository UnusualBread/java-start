package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L02_method_references;

/*
You need to create an object that represents a comparison function and assign
it to the comparator variable. The comparison function should take 2 parameters
and return the minimum of them if the array should be sorted in ascending
order, and the maximum of them if the array should be sorted in descending
order.
*/

import java.util.*;
import java.util.function.*;

public class T01_ArraySorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = "ascending".equals(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        BiFunction<Integer, Integer, Integer> comparator = null;

        comparator = isAscending ? Math::min : Math::max;

        sort(array, comparator);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void sort(int[] array, BiFunction<Integer, Integer, Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.apply(array[j], array[j + 1]) == array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
