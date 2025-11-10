package theory.M03_working_with_data.S01_file_processing.L02_reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T01_IntegerFileSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        sc.close();

        try (Scanner fileScanner = new Scanner(file)) {
            int sum = getSumFromFile(fileScanner);
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + path);
        }
    }

    private static int getSumFromFile(Scanner fileScanner) {
        int sum = 0;
        while (fileScanner.hasNextInt()) sum += fileScanner.nextInt();
        return sum;
    }
}
