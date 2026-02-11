package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM04_task_processing.L02_interruptions;

/*
The class CounterThread extends Thread and overrides the run method. The method
increments the counter variable in a loop. As it is now, the loop works
infinitely. You should fix it by adding interruption handling.
*/

class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (!Thread.currentThread().isInterrupted()) {
            counter++;
        }

        System.out.println("It was interrupted");
    }
}