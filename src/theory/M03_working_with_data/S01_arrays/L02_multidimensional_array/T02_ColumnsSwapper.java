package theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the
columns with indexes i and j within the matrix.
Input contains matrix dimensions n and m, not exceeding 100, then the elements
of the matrix, then the indexes i and j.
*/

import java.util.Scanner;

class T02_ColumnsSwapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();

        int[][] array = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int firstIndex = sc.nextInt();
        int secondIndex = sc.nextInt();

        for (int i = 0; i < numberOfRows; i++) {
            int tmp = array[i][firstIndex];
            array[i][firstIndex] = array[i][secondIndex];
            array[i][secondIndex] = tmp;
        }

        for (int[] row : array) {
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
