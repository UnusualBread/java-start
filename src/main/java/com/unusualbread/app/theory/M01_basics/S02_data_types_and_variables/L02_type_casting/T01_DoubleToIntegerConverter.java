package com.unusualbread.app.theory.M01_basics.S02_data_types_and_variables.L02_type_casting;

/*
Please write a Java program that reads in a number of type double and prints it
to the console as an integer. All values are guaranteed to be within the valid
range of their data types.
*/

import java.util.Scanner;

public class T01_DoubleToIntegerConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberDouble = sc.nextDouble();

        int numberInteger = (int) numberDouble;

        System.out.println(numberInteger);

        sc.close();
    }
}
