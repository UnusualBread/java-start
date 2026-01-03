package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

/*
Output each of its elements in the loop. Each element must be in a new line.
*/

import java.util.*;

public class T01_ElementsPrinter {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
