package C02_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

/*
N squirrels found K nuts and decided to divide them equally.
Find how many nuts will be left after each of the squirrels
takes the equal amount of nuts.
*/

import java.util.Scanner;

public class T08_NutsCalculator_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squirrelsNumber = sc.nextInt();
        int nutsNumber = sc.nextInt();

        int nutsLeft = nutsNumber % squirrelsNumber;

        System.out.println(nutsLeft);

        sc.close();
    }
}
