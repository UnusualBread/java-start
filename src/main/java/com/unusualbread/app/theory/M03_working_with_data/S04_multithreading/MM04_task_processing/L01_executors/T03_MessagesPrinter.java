package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM04_task_processing.L01_executors;

/*
Complete class AsyncMessageSenderImpl:
    - it should use ExecutorService to send multiple messages in parallel;
    - implement repeating of messages in the sendMessage method;
    - implement the stop method to shut down the executor
*/

import java.util.concurrent.*;

class Message {
    final String text;
    final String from;
    final String to;

    Message(String from, String to, String text) {
        this.text = text;
        this.from = from;
        this.to = to;
    }
}

interface AsyncMessageSender {
    void sendMessages(Message[] messages);
    void stop();
}

class AsyncMessageSenderImpl implements AsyncMessageSender {
    private final ExecutorService executor;
    private final int repeatFactor;

    public AsyncMessageSenderImpl(int repeatFactor) {
        this.repeatFactor = repeatFactor;
        executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public void sendMessages(Message[] messages) {
        for (Message msg : messages) {
            for (int i = 0; i < repeatFactor; i++) {
                executor.submit(() -> {
                    System.out.printf("(%s>%s): %s\n", msg.from, msg.to, msg.text);
                });
            }
        }
    }

    @Override
    public void stop() {
        executor.shutdown();
    }
}