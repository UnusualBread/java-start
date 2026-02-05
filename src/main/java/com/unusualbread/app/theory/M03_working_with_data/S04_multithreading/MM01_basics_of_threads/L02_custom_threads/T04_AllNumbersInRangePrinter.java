package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L02_custom_threads;

/*
Write a class named NumbersThread that extends the Thread class. The class must
have a constructor that takes two integer numbers from and to as range borders.

Implement the method run. It must print all numbers from the given range
(inclusive) to the standard output.
*/

class NumbersThread extends Thread {

    final int from;
    final int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}
