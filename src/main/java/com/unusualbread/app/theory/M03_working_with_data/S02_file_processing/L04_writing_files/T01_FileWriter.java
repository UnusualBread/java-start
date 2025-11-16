package com.unusualbread.app.theory.M03_working_with_data.S02_file_processing.L04_writing_files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T01_FileWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = askPathToFile(sc);

        boolean append = isAppend(sc);

        String data = getData(sc);

        int number = getNumberOfLines(sc);

        sc.close();

        writeDataToFile(path, append, number, data);
    }

    private static void writeDataToFile(String path, boolean append, int number, String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, append))) {
            for (int i = 0; i < number; i++) {
                writer.println(data);
            }
            System.out.println("The data has been written to the file\nGoodbye!");
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static int getNumberOfLines(Scanner sc) {
        System.out.println("How many lines of this data should be written to the file?\nEnter positive number (default: 1): ");
        return Math.max(!sc.hasNextInt() ? 0 : sc.nextInt(), 1);
    }

    private static String getData(Scanner sc) {
        System.out.println("Enter data to write:");
        return sc.nextLine();
    }

    private static boolean isAppend(Scanner sc) {
        System.out.println("Do you want to overwrite the data in the file or append?\nEnter append/overwrite (default: append): ");
        return !"overwrite".equals(sc.nextLine());
    }

    private static String askPathToFile(Scanner sc) {
        System.out.println("Specify the path to the file to be written to:");
        return sc.nextLine();
    }
}
