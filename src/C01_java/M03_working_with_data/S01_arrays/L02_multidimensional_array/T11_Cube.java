package C01_java.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
You need to implement the createCube method. It should create a 3x3x3
three-dimensional array with the following content:

[0, 1, 2], [3, 4, 5], [6, 7, 8],
[0, 1, 2], [3, 4, 5], [6, 7, 8],
[0, 1, 2], [3, 4, 5], [6, 7, 8];
*/

class ArrayOperations3 {
    public static int[][][] createCube() {
        int [][][] cube = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            int val = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cube[i][j][k] = val++;
                }
            }
        }

        return cube;
    }
}
