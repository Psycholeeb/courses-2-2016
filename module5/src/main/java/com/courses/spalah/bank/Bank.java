package com.courses.spalah.bank;

import java.math.BigDecimal;

public class Bank {
    private String name;
    private Deposit deposit1;
    private Deposit deposit2;
    private Deposit deposit3;

    public Bank(String name) {
        this.name = name;
        this.deposit1 = new Deposit(100.56, 20.0, "Max");
        this.deposit2 = new Deposit(200.75, 25.5, "Alex");
        this.deposit3 = new Deposit(300.77, 27.5, "Jack");
    }

    public BigDecimal overallPayout(int years) {
        BigDecimal payout = deposit1.cleanProfit(years);
        payout = payout.add(deposit2.cleanProfit(years));
        payout = payout.add(deposit3.cleanProfit(years));
        payout = payout.add(deposit1.getInitialDeposit());
        payout = payout.add(deposit2.getInitialDeposit());
        payout = payout.add(deposit3.getInitialDeposit());
        return payout;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("BANK");
        System.out.printf("%.3f",bank.overallPayout(2));
    }
}

