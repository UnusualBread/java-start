package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by
recording the result into the new array m×n in size.
*/

import java.util.Scanner;

class T05_ArrayRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] inputArr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }

        int[][] rotatedArr = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotatedArr[i][j] = inputArr[rows - 1 - j][i];
            }
        }

        for (int[] row : rotatedArr) {
            boolean isFirst = true;
            for (int value : row) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                isFirst = false;
                System.out.print(value);
            }
            System.out.println(" ");
        }
    }
}
