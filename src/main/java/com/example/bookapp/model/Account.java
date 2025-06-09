package com.example.bookapp.model;

public class Account {
    private final int accno;
    private final String name;
    private final double balance;

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
