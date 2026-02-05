package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L01_threads_as_objects;

/*
Implement the method printIfDaemon of the ThreadUtil class which accepts a
Thread object and prints daemon if the thread is daemon or not daemon otherwise
*/

class ThreadUtil2 {
    public static void printIfDaemon(Thread thread) {
        System.out.println(thread.isDaemon() ? "daemon" : "not daemon");
    }
}
