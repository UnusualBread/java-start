package C02_java.M02_code_organization.S02_methods.L05_calling_methods;

/*
According to the formula, the area of a parallelogram is the result of the
multiplication of the base and the height of the figure. Call the method
countAreaOfParallelogram that calculates the area of the parallelogram with
the following parameters b and h.
*/

import java.util.Scanner;

public class T03_AreaOfParallelogramGetter {

    public static void main(String[] args) {
        // call the method here
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();

        countAreaOfParallelogram(base, height);

        sc.close();
    }

    // Do not change code below
    public static void countAreaOfParallelogram(int b, int h) {

        System.out.println(b * h);
    }
}
