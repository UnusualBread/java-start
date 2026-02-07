package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM02_synchronization.L02_thread_synchronization;

/*
Here's a class named Counter The class has a single field count. An instance of
the class is accessed by different threads concurrently. Each thread invokes
the method inc to increment the field many times.

After the completion of all threads, this field has an incorrect value.

Fix the code, so that it can work correctly with multiple threads.
*/

class Counter {
    int count = 0;

    public synchronized void inc() {
        count++;
    }
}