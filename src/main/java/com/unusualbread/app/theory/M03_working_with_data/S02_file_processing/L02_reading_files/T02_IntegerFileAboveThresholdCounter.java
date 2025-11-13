package com.unusualbread.app.theory.M03_working_with_data.S02_file_processing.L02_reading_files;

/*
Here is a file containing a sequence of integers separated by spaces.

Download it and write a Java program that counts numbers that are greater than
or equal to 9999.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T02_IntegerFileAboveThresholdCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        int threshold = sc.nextInt();
        sc.close();

        try (Scanner fileScanner = new Scanner(file)) {
            int count = getCountAboveThresholdFromFile(fileScanner, threshold);
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
    }

    private static int getCountAboveThresholdFromFile(Scanner fileScanner, int threshold) {
        int count = 0;
        while (fileScanner.hasNextInt()) if (fileScanner.nextInt() >= threshold) count++;
        return count;
    }
}
