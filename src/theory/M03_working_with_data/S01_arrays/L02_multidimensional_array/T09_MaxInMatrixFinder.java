package theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Find the indexes of the initial appearance of the maximum element in a matrix.
*/

import java.util.Scanner;

class T09_MaxInMatrixFinder {
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
        sc.close();

        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println(rowIndex + " " + colIndex);
    }
}
