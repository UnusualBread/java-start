package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Given the number n, not greater than 100, create a matrix of size n×n and fill
it using the following rule. Numbers 0 should be stored on the primary (main)
diagonal. The two diagonals, adjacent to the primary one, should contain
numbers 1. The next two diagonals should contain numbers 2; etc.
*/

import java.util.Scanner;

class T04_DigitPatternCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = Math.abs(i - j);
            }
        }

        for (int[] row : arr) {
            boolean isFirst = true;
            for (int value : row) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                isFirst = false;
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
