package C02_java.M01_basics.S05_control_flow_statements.L06_ternary_operator;

/*
Given a number as input, if the number is divisible by 5 print 'Fizz',
if it is divisible by 3 print 'Buzz', and if it is divisible by both
3 and 5 print 'FizzBuzz'. In case none of these conditions are met
print the input number. Write your code in one line using the ternary operator.
*/

import java.util.Scanner;

public class T04_FizzBuzzDeterminer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number % 3 == 0 ? number % 5 == 0 ? "FizzBuzz" : "Buzz" : number % 5 == 0 ? "Fizz" : number);

        sc.close();
    }
}
