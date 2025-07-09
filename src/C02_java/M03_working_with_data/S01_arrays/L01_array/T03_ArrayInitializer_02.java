package C02_java.M03_working_with_data.S01_arrays.L01_array;

/*
Initialize an int array named numbers with five elements
12, 17, 8, 101, 33 and output it.
*/

import java.util.Arrays;

public class T03_ArrayInitializer_02 {

    public static void main(String[] args) {

        int[] numbers = {12, 17, 8, 101, 33}; // initialize the array

        System.out.println(Arrays.toString(numbers));
    }
}
