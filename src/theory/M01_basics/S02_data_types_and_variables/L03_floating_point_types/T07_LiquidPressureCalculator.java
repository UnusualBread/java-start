package theory.M01_basics.S02_data_types_and_variables.L03_floating_point_types;

/*
Write a program that reads the density of a liquid ρ and the height of
a column h, and calculates the liquid pressure p.
*/

import java.util.Scanner;

public class T07_LiquidPressureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double density = sc.nextDouble();
        double height = sc.nextDouble();
        double gravity = 9.8;

        double pressure = density * gravity * height;

        System.out.println(pressure);

        sc.close();
    }
}
