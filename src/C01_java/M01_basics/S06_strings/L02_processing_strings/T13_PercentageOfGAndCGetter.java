package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program, which calculates the percentage of G characters (guanine) and
C characters (cytosine) in the entered string. Your program should be case
independent.
*/

import java.util.Scanner;

public class T13_PercentageOfGAndCGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'g' || ch == 'c') count++;
        }

        double percentage = (double) count / str.length() * 100;

        System.out.println(percentage);
    }
}
