package C02_java.M03_working_with_data.S01_arrays.L01_array;

/*
Create an array of longs named longNumbers with three elements
100000000001, 100000000002, 100000000003.
Then output the array.
*/

import java.util.Arrays;

public class T01_ArrayInitializer_01 {

    public static void main(String[] args) {

        long[] longNumbers = {100000000001L, 100000000002L, 100000000003L};

        System.out.println(Arrays.toString(longNumbers));
    }
}
