package com.courses.spalah;

/**
 * Created by Татьяна on 17.07.2016.
 */
public class Deposit {
    private double initAmount;
    private double rate;
    private String name;

    public Deposit(double initAmount, double rate, String name) {
        this.initAmount = initAmount;
        this.rate = rate;
        this.name = name;
    }

    public double Profit(int years) {
        double amount = initAmount + initAmount * rate / 100;
        for (int i = 0; i < years - 1; i++) {
            amount = amount + amount * rate / 100;
        }
        return amount - initAmount;
    }
}
