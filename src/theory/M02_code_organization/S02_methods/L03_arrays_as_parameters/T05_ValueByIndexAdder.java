package theory.M02_code_organization.S02_methods.L03_arrays_as_parameters;

/*
Write a method named addValueByIndex.
The method should take an array of longs and add a
value to the specified element by its index.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T05_ValueByIndexAdder {

    // write a method here
    public static void addValueByIndex(long[] arr, int ind, long val) {
        arr[ind] += val;
    }


    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
