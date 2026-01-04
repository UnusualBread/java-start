package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

import java.util.*;

public class T03_NeighboursFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = readIntegerArrayList(sc);
        int base = sc.nextInt();

    }

    private static ArrayList<Integer> readIntegerArrayList(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        for (String string : strings) {
            list.add(Integer.parseInt(string));
        }
        return list;
    }
}