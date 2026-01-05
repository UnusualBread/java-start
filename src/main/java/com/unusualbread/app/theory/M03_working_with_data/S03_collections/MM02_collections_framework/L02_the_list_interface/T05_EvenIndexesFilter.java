package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
Write a program that reads a list of integer numbers separated by spaces from
the standard input and then removes all numbers with even indexes (0, 2, 4, and
so on).
After that, the program should output the resulting sequence in reverse order.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T05_EvenIndexesFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<String> strings = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        strings.forEach(s -> list.add(Integer.parseInt(s)));
        List<Integer> filteredList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                filteredList.add(list.get(i));
            }
        }
        filteredList.reversed().forEach(n -> System.out.print(n + " "));
    }
}
