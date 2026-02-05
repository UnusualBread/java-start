package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L03_thread_management;

/*
Implement a method that takes three objects (instances of Thread or its
subclasses). The method must start the passed objects as threads in a way that
the order of their execution goes like this: t3, t2, t1. These threads print
secret phrases to the standard output, their output must always be the same.
*/

class Invoker {

    public static void invokeMethods(Thread t1, Thread t2, Thread t3) throws InterruptedException {
        t3.start();
        t3.join();

        t2.start();
        t2.join();

        t1.start();
        t1.join();
    }
}