package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
n this task, you need to implement reverseElements method. It should reverse
all rows of the twoDimArray as in the example below.
0 0 9 9              9 9 0 0
1 2 3 4 will become: 4 3 2 1
5 6 7 8              8 7 6 5
*/

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int[] row : twoDimArray) {
            for (int i = 0; i < row.length / 2; i++) {
                int tmp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = tmp;
            }
        }
    }
}
