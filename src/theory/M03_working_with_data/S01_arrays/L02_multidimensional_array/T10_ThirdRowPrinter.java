package theory.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
You need to implement printTheThirdRow method. It should print the third row of
the twoDimArray. The elements should be separated by space.
*/

class ArrayOperations2 {
    public static void printTheThirdRow(int[][] twoDimArray) {
        boolean isFirst = true;
        for (int value : twoDimArray[2]) {
            if (!isFirst) {
                System.out.print(" ");
            }
            isFirst = false;
            System.out.print(value);
        }
    }
}
