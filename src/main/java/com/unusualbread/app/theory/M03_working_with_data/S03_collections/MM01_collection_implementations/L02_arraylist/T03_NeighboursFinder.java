package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T03_NeighboursFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = readIntegerArrayList(sc);
        int base = sc.nextInt();
        ArrayList<Integer> neighbours = findNeighbours(numbers, base);
        neighbours.forEach((n -> System.out.print(n + " ")));
    }

    private static ArrayList<Integer> findNeighbours(ArrayList<Integer> numbers, int base) {
        ArrayList<Integer> neighbours = new ArrayList<>();
        int minDiff = getDifference(numbers, base,0);
        neighbours.add(numbers.getFirst());
        for (int i = 1; i < numbers.size(); i++) {
            int diff = getDifference(numbers, base, i);
            if (diff < minDiff) {
                minDiff = diff;
                neighbours.clear();
                neighbours.add(numbers.get(i));
            } else if (diff == minDiff) {
                neighbours.add(numbers.get(i));
            }
        }
        neighbours.sort(Integer::compareTo);
        return neighbours;
    }

    private static int getDifference(ArrayList<Integer> numbers, int base, int index) {
        return Math.abs(numbers.get(index) - base);
    }

    private static ArrayList<Integer> readIntegerArrayList(Scanner sc) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        for (String str : strings) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }
}