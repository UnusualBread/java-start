package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

/*
Create an ArrayList named list in any way known to you and fill it with the
following four numbers: 2, 0, 1, 7.
*/

import java.util.ArrayList;
import java.util.List;

public class T05_ListDisplayer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2, 0, 1, 7));
        System.out.println(list);
    }
}