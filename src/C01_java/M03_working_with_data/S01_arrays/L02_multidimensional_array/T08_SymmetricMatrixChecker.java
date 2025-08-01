package C01_java.M03_working_with_data.S01_arrays.L02_multidimensional_array;

/*
Given the number n, not exceeding 10, and a matrix of size n × n.
Check whether this matrix is symmetric in relation to the main diagonal. Output
the word “YES”, if it is symmetric and the word “NO” otherwise.
*/

import java.util.Scanner;

class T08_SymmetricMatrixChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        boolean isSymmetric = true;

        outer:
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i][j] != arr[j][i]) {
                    isSymmetric = false;
                    break outer;
                }
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
