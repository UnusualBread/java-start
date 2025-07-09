package C02_java.M01_basics.S02_data_types_and_variables.L06_primitive_and_reference_types;

/*
You are given a number as the input. Your task is to determine whether it is a
positive integer, negative integer, zero or a non-integer. If the integer is
positive, print 'positive'. If it is negative, print 'negative'. If the integer
is zero, print 'zero'. If it is a non-integer, print 'non-integer'.
*/

import java.util.Scanner;

public class T02_TypeDeterminer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        } else {
            System.out.println("non-integer");
        }

        sc.close();
    }
}
