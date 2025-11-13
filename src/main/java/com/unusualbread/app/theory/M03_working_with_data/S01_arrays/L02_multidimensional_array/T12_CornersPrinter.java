package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
You need to implement printCorners method. It should print all corner elements
of the twoDimArray in the following order: left to right and top to bottom.
*/

class ArrayOperations4 {
    public static void printCorners(int[][] twoDimArray) {
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[0].length - 1]);
        System.out.println(twoDimArray[twoDimArray.length - 1][0] + " " + twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1]);

       /* for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                boolean isCorner = (i == 0 && j == 0
                        || i == 0 && j == twoDimArray[i].length - 1
                        || i == twoDimArray.length - 1 && j == 0
                        || i == twoDimArray.length - 1 && j == twoDimArray[i].length - 1);

                if (isCorner) {
                    if (j == 0) {
                        System.out.print(twoDimArray[i][j] + " ");
                    } else {
                        System.out.println(twoDimArray[i][j]);
                    }
                }
            }
        }*/
    }
}
