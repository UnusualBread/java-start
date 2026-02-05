package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L01_threads_as_objects;

/*
Implement a method that prints the information about the thread executing this
method. The information includes the thread's name and its priority.
*/

class Info {
    public static void printCurrentThreadInfo() {
        Thread thread = Thread.currentThread();
        System.out.printf("""
                name: %s
                priority: %s
                """, thread.getName(), thread.getPriority()
        );
    }
}
