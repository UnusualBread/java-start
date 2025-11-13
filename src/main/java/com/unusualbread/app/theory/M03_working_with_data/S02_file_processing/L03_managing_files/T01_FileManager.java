package com.unusualbread.app.theory.M03_working_with_data.S02_file_processing.L03_managing_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class T01_FileManager {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (run(sc)) return;
        }
    }

    private static boolean run(Scanner sc) throws IOException {
        printMenu();
        switch (Integer.parseInt(sc.nextLine())) {
            case 1 -> create(sc);
            case 2 -> rename(sc);
            case 3 -> delete(sc);
            case 0 -> {
                System.out.println("Bye!");
                return true;
            }
        }
        return false;
    }

    private static void printMenu() {
        System.out.println("""
                
                Choose file or directory managing option:
                1 - create
                2 - rename/move
                3 - delete
                0 - exit""");
    }

    private static void delete(Scanner sc) {
        System.out.println("Enter path to existing file or directory: ");
        File file = new File(sc.nextLine());
        if (file.isFile()) System.out.println(file.delete() ? "File deleted" : "File not deleted");
        else {
            System.out.println(deleteDirRecursively(file) ? "Directory deleted" : "Directory not deleted");
        }
    }

    private static void rename(Scanner sc) {
        System.out.print("Enter path to existing file or directory: ");
        File file = new File(sc.nextLine());
        System.out.print("Enter new path: ");
        File newFile = new File(sc.nextLine());
        if (file.isFile()) System.out.println(file.renameTo(newFile) ? "File renamed or moved" : "File not renamed or moved");
        else System.out.println(file.renameTo(newFile) ? "Directory renamed or moved" : "Directory not renamed or moved");
    }

    private static void create(Scanner sc) throws IOException {
        System.out.print("Enter path to new file or directory: ");
        String path = sc.nextLine();
        File file = new File(path);
        if (path.endsWith(File.separator)) createDir(file);
        else createFile(file);
    }

    private static void createDir(File file) {
        System.out.println(file.mkdirs() ? "Directory %s created".formatted(file.getName()) : "Directory %s not created".formatted(file.getName()));
    }

    private static void createFile(File file) throws IOException {
        System.out.println(file.createNewFile() ? "File %s created".formatted(file.getName()) : "File %s not created".formatted(file.getName()));
    }

    private static boolean deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        if (children != null) {
            for (File child : children) {
                if (child.isDirectory()) deleteDirRecursively(child);
                else child.delete();
            }
        }
        return dir.delete();
    }
}
