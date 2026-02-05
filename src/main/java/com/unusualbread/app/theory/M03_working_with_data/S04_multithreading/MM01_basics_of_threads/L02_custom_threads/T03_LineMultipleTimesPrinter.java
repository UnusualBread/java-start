package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
Write a service that takes a message and the number of its repetitions as
constructor parameters and prints the message to the standard output the
specified number of times.
*/

class MessageNotifier extends Thread {

    final String msg;
    final int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);
        }
    }
}
