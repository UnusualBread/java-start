package theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Your task is to draw a star on the n×n field using the symbols . and *. n is
odd and doesn't exceed 15.
*/

import java.util.Scanner;

class T06_StarPatterCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[][] arr = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1 || i == (size - 1) / 2 || j == (size - 1) / 2) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = ".";
                }
            }
        }

        for (String[] row : arr) {
            boolean isFirst = true;
            for (String str : row) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                isFirst = false;
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
