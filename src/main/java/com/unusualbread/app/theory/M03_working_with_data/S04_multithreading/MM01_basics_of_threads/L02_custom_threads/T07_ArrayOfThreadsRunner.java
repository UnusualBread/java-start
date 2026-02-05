package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
Implement a method that takes an array of Runnables. The method must start each
runnable in a new thread.
*/

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        for (Runnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }
}
