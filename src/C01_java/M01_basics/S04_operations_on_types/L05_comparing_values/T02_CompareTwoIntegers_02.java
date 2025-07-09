package C01_java.M01_basics.S04_operations_on_types.L05_comparing_values;

import java.util.Scanner;

/*
You are given two integers 'a' and 'b'. One per line in this order.
Your goal is to compare these integers using the basic relational
operators and print all results that are true. If 'a' is greater than
'b' print 'Greater'. If 'a' is less than 'b' print 'Less'. If 'a'
equals 'b' print 'Equal'. Make sure to evaluate all these conditions
for the given integers.
*/

public class T02_CompareTwoIntegers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();

        if (firstInteger > secondInteger) {
            System.out.println("Greater");
        } else if (firstInteger < secondInteger) {
            System.out.println("Less");
        } else {
            System.out.println("Equal");
        }

        scanner.close();
    }
}
