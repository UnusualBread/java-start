package theory.M01_basics.S04_operations_on_types.L03_floating_point_types;

import java.util.Scanner;

/*
Write a program that reads a temperature in Celsius (°C)
and shows its equivalent in Fahrenheit (°F).
*/

public class T01_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(fahrenheit);

        scanner.close();
    }
}





