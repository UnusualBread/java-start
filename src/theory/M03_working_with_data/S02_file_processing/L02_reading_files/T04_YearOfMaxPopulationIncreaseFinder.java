package theory.M03_working_with_data.S02_file_processing.L02_reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Here's a file that stores data on the world population since 1950, according to
the United States Census Bureau (2017).

Download the file and write a Java program to find out in what year the largest
increase in population occurred as compared to the previous year.
*/

public class T04_YearOfMaxPopulationIncreaseFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        sc.close();

        try (Scanner fileScanner = new Scanner(file)) {
            int max = getYearOfMaxIncreaseFromFile(fileScanner);
            System.out.println(max);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
    }

    private static int getYearOfMaxIncreaseFromFile(Scanner fileScanner) {
        int result = 0;
        fileScanner.nextLine();
        int year = fileScanner.nextInt();
        long previousNumber = Long.parseLong(fileScanner.nextLine().trim().replaceAll(",", ""));
        long maxDifference = Long.MIN_VALUE;

        while (fileScanner.hasNextInt()) {
            year = fileScanner.nextInt();
            long number = Long.parseLong(fileScanner.nextLine().trim().replaceAll(",", ""));
            long difference = number - previousNumber;

            if (difference > maxDifference) {
                maxDifference = difference;
                result = year;
            }
            previousNumber = number;
        }
        return result;
    }
}
