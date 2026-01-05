package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
Implement a method that returns an element by the specified index from a list.
The method must return an element by its regular or backward index.
*/

import java.util.*;
import java.util.stream.Collectors;

public class T01_BidirectionalIndexer {

    public static <T> T getElementByIndex(List<T> lst, int index) {
        return lst.get(index < 0 ? index + lst.size() : index);
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}
