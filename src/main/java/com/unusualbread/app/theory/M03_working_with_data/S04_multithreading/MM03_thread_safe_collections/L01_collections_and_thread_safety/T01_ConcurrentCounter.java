package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM03_thread_safe_collections.L01_collections_and_thread_safety;

/*
The following program demonstrates a fixed race condition that appears when two
threads add elements to the same collection.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T01_ConcurrentCounter {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());

        Thread writer = new Thread(() -> addNumbers(numbers));
        writer.start();

        addNumbers(numbers);

        writer.join();

        System.out.println(numbers.size());
    }

    private static void addNumbers(List<Integer> target) {
        for (int i = 0; i < 100_000; i++) {
            target.add(i);
        }
    }
}