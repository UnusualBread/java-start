package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM04_task_processing.L02_interruptions;

/*
You are dealing with the class Worker that extends Thread . The class overrides
the method run to do something useful. You need to start an instance of this
class (in a new thread), wait for it a little (2000-3000 milliseconds) and
interrupt this new thread.
*/

class InterruptedExample {

    private static final long mainThreadId = Thread.currentThread().threadId();

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();

        worker.start();
        Thread.sleep(3000);
        worker.interrupt();
    }

    static class Worker extends Thread {

        @Override
        public void run() {

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException("You need to wait longer!", e);
            }

            final long currentId = Thread.currentThread().threadId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            while (true) {
                if (isInterrupted()) {
                    System.out.println("Interrupted");
                    break;
                }
            }
        }
    }
}