package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM04_task_processing.L01_executors;

/*
Write a program that reads integer numbers from the standard input and prints
only those of them that are prime, in any order.
*/

import java.util.Scanner;
import java.util.concurrent.*;

public class T02_PrimeNumbersPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            executor.submit(new PrintIfPrimeTask(number));
        }
        executor.shutdown();
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return;
            }
        }
        if (number != 1) {
            System.out.println(number);
        }
    }
}