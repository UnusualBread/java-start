package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L02_arraylist;

/*
Implement a simple task list using ArrayList. The program should add tasks,
remove tasks by index, and display the current list. Input format: operation
(add/remove/display) followed by task description or index. For 'add', input
the task. For 'remove', input the index. For 'display', no additional input is
needed.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class T04_TaskManager {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            switch (operation) {
                case "add" -> taskList.add(scanner.nextLine());
                case "remove" -> taskList.remove(scanner.nextInt());
                case "display" -> System.out.println(taskList);
            }
        }

        scanner.close();
    }
}
