package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
A two-dimensional matrix stores the information on the sold tickets: the number
1 means that the ticket for this place is already sold, and the number 0 means
that the place is available. You want to buy k tickets to neighboring seats in
the same row. Find whether it can be done.
*/

import java.util.Scanner;

class T07_RowFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int desiredSeats = sc.nextInt();
        int requiredRow = 0;

        outer:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - desiredSeats; j++) {
                boolean isFound = true;
                for (int k = j; k < j + desiredSeats; k++) {
                    if (arr[i][k] != 0) {
                        isFound = false;
                        break;
                    }
                }
                if (isFound) {
                    requiredRow = i + 1;
                    break outer;
                }
            }
        }
        System.out.println(requiredRow);
    }
}
