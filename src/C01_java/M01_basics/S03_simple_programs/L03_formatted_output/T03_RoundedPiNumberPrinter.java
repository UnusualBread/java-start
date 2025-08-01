package C01_java.M01_basics.S03_simple_programs.L03_formatted_output;

/*
Your task is to set the accuracy of the variable pi to three decimal places and
output the result.
*/

import java.util.Locale;

public class T03_RoundedPiNumberPrinter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;

        System.out.printf("%.3f", pi);
    }
}
