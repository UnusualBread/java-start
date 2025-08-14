package theory.M01_basics.S05_control_flow_statements.L03_switch;

import java.util.Scanner;

/*
Write a simple calculator that reads the three values from the line:
the first number, the operation, and the second number.

The program should apply the operation to the numbers entered ("first number"
"operation" "second number") and output the result to the screen.
Note that the numbers are long.
*/

public class T09_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNumber = sc.nextLong();
        String str = sc.next();
        char operator = str.charAt(0);
        long secondNumber = sc.nextLong();

        switch (operator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }

                break;
            default:
                System.out.println("Unknown operator");
        }

        sc.close();
    }
}
