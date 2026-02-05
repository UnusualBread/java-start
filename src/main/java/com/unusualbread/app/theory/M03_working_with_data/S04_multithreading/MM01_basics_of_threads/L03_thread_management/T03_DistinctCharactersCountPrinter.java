package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L03_thread_management;

/*
Implement the code that reads a string from the standard input and calculates
the number of distinct characters in the string.
*/

import java.util.Scanner;
import java.util.Arrays;

public class T03_DistinctCharactersCountPrinter {

    private static final long mainThreadId = Thread.currentThread().threadId();

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        SlowStringProcessor processor = new SlowStringProcessor(str);
        Thread thread = new Thread(processor);
        thread.start();

        thread.join();
        System.out.println(processor.getNumberOfUniqueCharacters());
    }

    static class SlowStringProcessor extends Thread {

        private final String s;
        private volatile long numberOfUniqueCharacters = 0;

        public SlowStringProcessor(String s) {
            this.s = s;
        }

        @Override
        public void run() {

            final long currentId = Thread.currentThread().threadId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException("Do not interrupt the processor", e);
            }

            this.numberOfUniqueCharacters = Arrays.stream(s.split("")).distinct().count();
        }

        public long getNumberOfUniqueCharacters() {
            return numberOfUniqueCharacters;
        }
    }
}