package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
Implement a method for splitting (partitioning) a generic list into sublists.
The method takes two arguments: a generic list and a size of sublists. The
specified size of sublists can be greater than the size of the given list.

Each sublist except the last one must have the specified size. The last sublist
can have a smaller number of elements.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ListUtils {
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();
        for (int i = 0; i < list.size(); i += subListSize) {
            sublists.add(list.subList(i, Math.min(i + subListSize, list.size())));
        }
        return sublists;
    }
}

public class T03_ListSplitter {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}
