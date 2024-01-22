package com.alamin.bank;

// AccountService.java
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountService {
    private final Map<String, Account> accounts = new ConcurrentHashMap<>();
    private final Map<String, Lock> accountLocks = new ConcurrentHashMap<>();

    public void createAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        accountLocks.put(accountNumber, new ReentrantLock());
    }

    public double getBalance(String accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    public void deposit(String accountNumber, double amount) {
        Lock lock = accountLocks.get(accountNumber);
        lock.lock();
        try {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Lock lock = accountLocks.get(accountNumber);
        lock.lock();
        try {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
        } finally {
            lock.unlock();
        }
    }
}
