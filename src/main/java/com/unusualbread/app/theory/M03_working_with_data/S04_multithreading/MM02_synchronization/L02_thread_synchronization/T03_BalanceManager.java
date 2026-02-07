package com.unusualbread.app.theory.M03_working_with_data.S04_multithreading.MM02_synchronization.L02_thread_synchronization;

/*
You have a class named Account. It has a long field storing the current
balance. The account has three not-implemented methods:

deposit method adds an amount to the balance;

withdraw method subtracts an amount from the balance if the account has enough
money. The method must return true if the operation is successful, otherwise,
it returns false;

getBalance method returns the current balance.

Implement the given methods. The class should work correctly with multiple
threads.
*/

class Account {

    private long balance = 0;

    public synchronized boolean withdraw(long amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized void deposit(long amount) {
        balance += amount;
    }

    public synchronized long getBalance() {
        return balance;
    }
}