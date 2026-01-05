package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
Implement a method that takes an integer value and two lists of numbers. It
must check if the value occurs the same number of times in both sequences.
*/

import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return countOccurrences(list1, elem) == countOccurrences(list2, elem);
    }

    private static int countOccurrences(List<Integer> list, int elem) {
        int count = 0;
        for (int number : list) {
            if (number == elem) {
                count++;
            }
        }
        return count;
    }
}
