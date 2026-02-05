package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
1) Create two instances of the given class and set the names like "worker-X",
where X is any suffix (use the constructor to set the name).
2) Start the created threads. The method run of each instance must be executed
in a new thread.
*/

public class T01_TwoThreadsRunner {
    public static void main(String[] args) {
        Thread firstWorker = new WorkerThread("worker-0");
        firstWorker.start();

        Thread secondWorker = new WorkerThread("worker-1");
        secondWorker.start();
    }
}

class WorkerThread extends Thread {
    private static final int NUMBER_OF_LINES = 3;

    public WorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (!name.startsWith("worker-")) {
            return;
        }

        for (int i = 0; i < NUMBER_OF_LINES; i++) {
            System.out.println("do something...");
        }
    }
}
