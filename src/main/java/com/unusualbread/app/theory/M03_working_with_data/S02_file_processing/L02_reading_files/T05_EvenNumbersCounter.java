package com.unusualbread.app.theory.M03_working_with_data.S02_file_processing.L02_reading_files;

/*
Here is a file containing a sequence of integers. Each number begins a new
line.

Download the file and write a Java program that counts the number of even
numbers in this file. You should stop counting either if you get 0 or the last
number is reached.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T05_EvenNumbersCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        sc.close();

        try (Scanner fileScanner = new Scanner(file)) {
            int count = getCountOfEvenNumbers(fileScanner);
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
    }

    private static int getCountOfEvenNumbers(Scanner fileScanner) {
        int count = 0;
        int number;
        number = fileScanner.nextInt();
        while (fileScanner.hasNextInt() && number != 0) {
            number = fileScanner.nextInt();
            if (number % 2 == 0) count++;
        }
        return count;
    }
}
