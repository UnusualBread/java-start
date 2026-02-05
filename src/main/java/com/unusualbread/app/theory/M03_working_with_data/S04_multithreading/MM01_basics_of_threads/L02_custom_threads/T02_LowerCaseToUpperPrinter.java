package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
Write a class with the name StringProcessor that extends the Thread class. The
class must have a method that reads strings (line by line) from the standard
input. If a read string has a character in lower case, the processor must
output the string in upper case; otherwise, the processor must output
"FINISHED" and stop the processing.
*/

import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            String input = scanner.nextLine();
            String inUpperCase = input.toUpperCase();
            if (input.equals(inUpperCase)) {
                System.out.println("FINISHED");
                break;
            }
            System.out.println(inUpperCase);
        }
    }
}