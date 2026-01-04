package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class T04_TaskManager {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            if (operation.equals("add")) {
                taskList.add(scanner.nextLine());
            } else if (operation.equals("remove")) {
                taskList.remove(scanner.nextInt());
            } else if (operation.equals("display")) {
                System.out.println(taskList);
            }
        }

        scanner.close();
    }
}
