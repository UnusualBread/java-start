package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that finds the frequency of occurrences of a substring in a
given string. Substrings cannot overlap: for example, the string ababa contains
only one substring aba.
*/

import java.util.Scanner;

public class T12_OccurrencesCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String substr = sc.nextLine();
        sc.close();

        int index = str.indexOf(substr);
        int count = 0;

        while (index != -1){
            count++;
            str = str.substring(index + substr.length());
            index = str.indexOf(substr);
        }

        System.out.println(count);
    }
}
