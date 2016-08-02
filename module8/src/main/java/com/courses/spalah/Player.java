package com.courses.spalah;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Player {
    String name;
    int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
