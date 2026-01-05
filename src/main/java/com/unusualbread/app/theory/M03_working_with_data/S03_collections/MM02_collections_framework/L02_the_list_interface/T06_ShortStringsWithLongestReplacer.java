package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
Implement the changeList method so that it:
    - finds the longest string in the list
    - replaces all list items with the found string
*/

import java.util.*;

public class T06_ShortStringsWithLongestReplacer {
    static void changeList(List<String> list) {
        String longestString = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > longestString.length()) {
                longestString = list.get(i);
            }
        }
        String finalLongestString = longestString;
        Collections.fill(list, finalLongestString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
