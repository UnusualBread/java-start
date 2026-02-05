package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L01_threads_as_objects;

/*
Implement the method getName of the ThreadUtil class which accepts a Thread
object and returns its name.
*/

class ThreadUtil {
    public static String getName(Thread thread) {
        return thread.getName();
    }
}
