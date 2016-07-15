package com.courses.spalah.bank;

import java.math.BigDecimal;

public class Deposit {

    private BigDecimal initialDeposit;
    private BigDecimal interestRate;
    private String clientName;

    public Deposit(double initialDeposit, double interestRate, String clientName) {
        this.initialDeposit = new BigDecimal(initialDeposit);
        this.interestRate = new BigDecimal(interestRate);
        this.clientName = clientName;
    }

    public BigDecimal cleanProfit(int years) {
        BigDecimal rate = new BigDecimal(1).add(interestRate.divide(new BigDecimal(100)));
        BigDecimal profit = initialDeposit;
        for (int i = 0; i < years; i++) {
            profit = profit.multiply(rate);
        }
        return profit.subtract(initialDeposit);
    }

    public BigDecimal getInitialDeposit() {
        return initialDeposit;
    }

    public static void main(String[] args) {
        Deposit deposit = new Deposit(100, 25, "Max");
        System.out.printf("%.3f" ,deposit.cleanProfit(2));
    }
}
