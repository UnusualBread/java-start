package C01_java.M01_basics.S02_data_types_and_variables.L02_type_casting;

/*
Write a Java program that accepts a float value as input. Your task is to
divide this float value by 2. The program should then print the output as an
integer value after rounding the result down.
*/

import java.util.Scanner;

public class T02_DivisionByTwoRounder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        int result = (int) number / 2;

        System.out.println(result);

        sc.close();
    }
}
