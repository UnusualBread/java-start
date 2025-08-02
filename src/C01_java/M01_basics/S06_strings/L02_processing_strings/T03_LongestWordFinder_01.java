package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
Write a Java program that receives a string representing a sentence. Your
program should find the longest word in the sentence and print it out.
*/

import java.util.Scanner;

public class T03_LongestWordFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        int maxLength = words[0].length();
        String longestWord = words[0];;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}
