package com.courses.spalah;

/**
 * Created by Татьяна on 17.07.2016.
 */
public class Bank {
    private String nameOfBank;
    Deposit deposit1;
    Deposit deposit2;
    Deposit deposit3;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
        deposit1 = new Deposit(1025.5, 17.5, "Tanya");
        deposit2 = new Deposit(680.5, 21.0, "Vasya");
        deposit1 = new Deposit(730.2, 15.5, "Petya");
    }

    public double Amount(int years) {
        return deposit1.Profit(years) + deposit2.Profit(years) + deposit3.Profit(years);
    }
}
