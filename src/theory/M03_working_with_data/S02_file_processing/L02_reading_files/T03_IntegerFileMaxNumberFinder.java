package theory.M03_working_with_data.S02_file_processing.L02_reading_files;

/*
Here is a file containing a sequence of integers separated by spaces.

Download it and write a Java program that finds the greatest number in this
file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T03_IntegerFileMaxNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        sc.close();

        try (Scanner fileScanner = new Scanner(file)) {
            int max = getMaxFromFile(fileScanner);
            System.out.println(max);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
    }

    private static int getMaxFromFile(Scanner fileScanner) {
        int max = Integer.MIN_VALUE;
        while (fileScanner.hasNextInt()) {
            max = Math.max(fileScanner.nextInt(), max);
        }
        return max;
    }
}
