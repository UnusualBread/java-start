package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L04_exceptions_in_threads;

/*
Exceptions in different threads are handled independently. While the process
has an alive non-daemon thread, it won't be stopped in case an uncaught
exception occurs. Still the good practice is to handle exceptions in threads.
*/

public class T01_ExceptionInThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread();
        thread.start();
        thread.join();
        System.out.println("I am printed!");
    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println(2 / 0);
    }
}