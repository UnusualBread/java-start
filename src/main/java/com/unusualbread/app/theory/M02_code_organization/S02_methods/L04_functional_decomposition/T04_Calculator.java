package com.unusualbread.app.theory.M02_code_organization.S02_methods.L04_functional_decomposition;

/*
Design a simple calculator program using functional decomposition. Create
methods for addition, subtraction, multiplication, and division. The main
method should take two numbers and an operator as input, then call the
appropriate method based on the operator.
*/

import java.util.Scanner;

public class T04_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);

        double result = 0;

        boolean isDivisionByZero = false;

        switch (operator) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                if (isDivisionByZero(num2)) {
                    isDivisionByZero = true;
                    break;
                }

                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(isDivisionByZero ? "Division by 0!" : result);
    }

    public static boolean isDivisionByZero(double b) {
        return b == 0;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
