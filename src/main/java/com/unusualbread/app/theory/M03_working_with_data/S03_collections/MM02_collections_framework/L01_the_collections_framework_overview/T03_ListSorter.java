package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L01_the_collections_framework_overview;

/*
Implement a program in Java that takes an integer as input. Add a rule to have
the program convert that integer into a List with each digit as an element.
Then, use the Collections framework to sort the list in ascending order. Your
program should print the sorted list as the output.
*/

import java.lang.Integer;
import java.util.*;

public class T03_ListSorter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<Integer> numbers = convertToList(number);
        System.out.println(numbers);
    }

    public static List<Integer> convertToList(int number){
        List<Integer> numbers = new ArrayList<>();
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            numbers.add(Character.getNumericValue(str.charAt(i)));
        }
        numbers.sort(Integer::compareTo);
        return numbers;
    }
}
