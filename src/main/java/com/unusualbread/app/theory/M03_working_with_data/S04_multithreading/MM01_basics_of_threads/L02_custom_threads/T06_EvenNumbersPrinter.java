package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
Write a class with the name NumbersFilter that extends the Thread class and
overrides the method run. It should read integer numbers from the standard
input (line by line). If the number is even, the worker must print it to the
standard output (each number on a new line), if a number is 0, the worker must
stop.
*/

import java.util.Scanner;

class NumbersFilter extends Thread {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        int number = scanner.nextInt();
        while (number != 0) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number = scanner.nextInt();
        }
    }
}
