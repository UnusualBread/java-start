package theory.M01_basics.S06_strings.L02_processing_strings;

/*
In the given string find the first longest word and output it.
*/

import java.util.Scanner;

public class T08_LongestWordFinder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        int maxLength = words[0].length();
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}
