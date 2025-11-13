package com.unusualbread.app.theory.M01_basics.S02_data_types_and_variables.L03_floating_point_types;

/*
Write a program that reads two double values and prints
the difference between the second and the first one.
*/

import java.util.Scanner;

public class T05_DifferenceBetweenDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        double secondNumber = sc.nextDouble();

        System.out.println(secondNumber - firstNumber);

        sc.close();
    }
}
