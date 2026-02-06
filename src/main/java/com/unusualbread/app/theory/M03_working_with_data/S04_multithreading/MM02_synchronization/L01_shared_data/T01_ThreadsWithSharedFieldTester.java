package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM02_synchronization.L01_shared_data;

/*
Since thread 1 never modifies the variable run (it only reads from it), it
decided to cache it for performance. Any changes to the variable run will not
be visible to thread 1 because it is being accessed from the CPU cache, and not
from memory.

This happens because the variable is non-volatile and the JVM has the freedom
to choose to cache it for performance, and the cached value is always true.

On the other hand, by making run volatile forbids the JVM from caching the
value of run and the program executes as expected.
*/

class VolatileExample {
    public volatile boolean run = true;

    public void test() {
        new Thread(() -> {
            long count = 0;
            System.out.println("Thread 1 started");
            while (run) {
                ++count;
            }
            System.out.println("Counted up to " + count);
            System.out.println("Thread 1 finished.");
        }).start();

        new Thread(() -> {
            System.out.println("Thread 2 started.");
            System.out.println("Setting run to false.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run = false;
            System.out.println("Thread 2 finished.");
        }).start();
    }

    public static void main(String[] args) {
        new VolatileExample().test();
    }
}