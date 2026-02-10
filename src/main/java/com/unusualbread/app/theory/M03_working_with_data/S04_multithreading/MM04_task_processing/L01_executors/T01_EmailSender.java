package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM04_task_processing.L01_executors;

/*
Implement the asyncSend method by iterating through messages and sending them
via sender. Use a single thread pool executor and do not forget to shut it
down.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class T01_EmailSender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messageCounts = scanner.nextInt();
        List<String> messages = new ArrayList<>();
        for (int i = 0; i < messageCounts; ++i) {
            messages.add(scanner.next());
        }

        MailSender sender = new MockMailSender();
        asyncSend(sender, messages);
    }

    static void asyncSend(MailSender sender, List<String> messages) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        messages.forEach(s -> executor.submit(() -> sender.send(s)));
        executor.shutdown();
    }
}

interface MailSender {
    void send(String message);
}

class MockMailSender implements MailSender {
    public void send(String message) {
        System.out.println("Message " + message + " was sent");
    }
}
