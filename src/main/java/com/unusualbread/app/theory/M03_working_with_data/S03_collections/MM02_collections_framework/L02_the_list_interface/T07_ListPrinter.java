package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L02_the_list_interface;

/*
You're given a sequence of strings separated by spaces. Read the sequence from
the standard input and store all strings in a list. Output the list to the
standard output using System.out.println(yourList).
*/

import java.util.List;
import java.util.Scanner;

public class T07_ListPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = List.of(sc.nextLine().split(" "));
        System.out.println(list);
    }
}
