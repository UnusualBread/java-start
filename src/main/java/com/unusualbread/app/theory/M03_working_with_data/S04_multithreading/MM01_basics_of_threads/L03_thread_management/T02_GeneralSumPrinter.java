package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM01_basics_of_threads.L03_thread_management;

/*
The code is supposed to find the general sum of two inclusive integer ranges
concurrently.
*/

import java.util.Scanner;

public class T02_GeneralSumPrinter {

    private static final long mainThreadId = Thread.currentThread().threadId();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int from1Incl = scanner.nextInt();
        int to1Incl = scanner.nextInt();

        int from2Incl = scanner.nextInt();
        int to2Incl = scanner.nextInt();

        RangeSummator summator1 = new RangeSummator(from1Incl, to1Incl);
        Thread thread1 = new Thread(summator1);
        thread1.start();

        RangeSummator summator2 = new RangeSummator(from2Incl, to2Incl);
        Thread thread2 = new Thread(summator2);
        thread2.start();

        thread1.join();
        long partialSum1 = summator1.getResult();

        thread2.join();
        long partialSum2 = summator2.getResult();

        long sum = partialSum1 + partialSum2;

        System.out.println(sum);
    }

    static class RangeSummator extends Thread {

        int fromIncl;
        int toIncl;

        private volatile long result = 0;

        public RangeSummator(int fromIncl, int toIncl) {
            this.fromIncl = fromIncl;
            this.toIncl = toIncl;
        }

        @Override
        public void run() {
            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            long sum = 0;
            for (int i = fromIncl; i <= toIncl; i++) {
                sum += i;
            }

            result = sum;
        }

        public long getResult() {
            return result;
        }
    }
}
