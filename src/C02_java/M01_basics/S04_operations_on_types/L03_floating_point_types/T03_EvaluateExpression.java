package C02_java.M01_basics.S04_operations_on_types.L03_floating_point_types;

import java.util.Scanner;

/*
Write a program that reads four double values a, b, c, d
and then evaluates the following expression
*/

public class T03_EvaluateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;
        System.out.println(result);

        scanner.close();
    }
}
