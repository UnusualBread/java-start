package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
Write a program that reads an array of ints and outputs the number of
"triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1
(i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not). Triples may overlap.
For example, the sequence 1, 2, 3, 4, 5 contains three triples:
1, 2, 3; 2, 3, 4; and 3, 4, 5.
*/

import java.util.Scanner;

public class T13_TriplesCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < totalNumbers - 2; i++) {
            if (arr[i + 2] - arr[i + 1] == 1 && arr[i + 1] - arr[i] == 1) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
