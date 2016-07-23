package com.courses.spalah.bank;

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

    public double calculateProfit(int years) {
        double amount = initAmount;
        for (int i = 0; i < years; i++) {
            amount = amount + amount * rate / 100;
        }
        return amount - initAmount;
    }

    public double getInitAmount() {
        return initAmount;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}
