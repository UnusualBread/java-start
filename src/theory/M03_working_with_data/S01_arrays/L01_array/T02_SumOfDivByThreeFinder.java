package theory.M03_working_with_data.S01_arrays.L01_array;

/*
Write a program that accomplishes the following tasks: 1. Accepts an integer
'n' as input which indicates the number of elements to be in the array. 2.
Afterward, accepts 'n' number of integers as input for elements of the array.
3. The program should then calculate the sum of all the elements in the array
which are multiples of 3. 4. Print the sum of these numbers as output.
*/

import java.util.Scanner;

public class T02_SumOfDivByThreeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int[] arr = new int[totalNumbers];

        int sum = 0;

        for (int i = 0; i < totalNumbers; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < totalNumbers; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
