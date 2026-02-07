package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM02_synchronization.L02_thread_synchronization;

/*
Here's a class named CountDownCounter. The class has a single field count. An
instance of the class is used by different threads concurrently. Each thread
invokes the method decrement to decrease the field many times.

After the completion of all threads, the field has an incorrect value.

Fix the code, so that it can work correctly with multiple threads.
*/

class CountDownCounter {
    int count;

    public CountDownCounter(int initial) {
        this.count = initial;
    }

    public synchronized void decrement() {
        count--;
    }
}
