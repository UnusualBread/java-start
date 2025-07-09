package C01_java.M02_code_organization.S02_methods.L03_arrays_as_parameters;

/*
Imagine an online game where users can compete with their scores. However, to
make it more challenging, the game takes two sets of scores instead of one.
Your task is to write a program that initially takes two integers n, m
(1 <= n, m <= 50) representing the number of scores in each set respectively.
Then, it takes n positive integers representing the score set A, and m positive
integers representing the score set B. The program should find the number of
common scores in both sets. Each score is less than or equal to 100.
*/

import java.util.Scanner;

public class T02_CommonScoresFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);
    }

    // Declare method findCommonScores here
    // This method takes two arrays as parameters and returns an integer
    // This method should contain the logic to find common elements in two arrays
    public static int findCommonScores(int[] a, int[] b) {
        int ind = 0;
        int[] commonScores = new int[Math.min(a.length, b.length)];

        for (int scoreOfFirst : a) {
            for (int scoreOfSecond : b) {
                if (scoreOfFirst == scoreOfSecond) {
                    boolean isInCommons = false;

                    for (int scoreInCommons : commonScores) {
                        if (scoreOfFirst == scoreInCommons) {
                            isInCommons = true;
                            break;
                        }
                    }

                    if (!isInCommons) {
                        commonScores[ind++] = scoreOfFirst;
                        break;
                    }
                }
            }
        }

        return ind;
    }
}
