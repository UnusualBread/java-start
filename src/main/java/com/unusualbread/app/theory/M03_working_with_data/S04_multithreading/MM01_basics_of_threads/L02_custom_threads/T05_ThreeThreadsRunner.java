package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
1) Create three threads using instances of RunnableWorker. Set the names of
these threads to "worker-X", where X is any suffix. Use the Thread(Runnable
target, String name) constructor to pass a thread name on thread creation.
2) Start all created threads. The method run of each instance must be executed
in a new thread.
*/

public class T05_ThreeThreadsRunner {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new RunnableWorker(), "worker-0");
        firstThread.start();

        Thread secondThread = new Thread(new RunnableWorker(), "worker-1");
        secondThread.start();

        Thread thirdThread = new Thread(new RunnableWorker(), "worker-2");
        thirdThread.start();
    }
}

class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        }
    }
}