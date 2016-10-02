package com.courses.spalah.HomeWork;

import java.math.BigDecimal;

/**
 * Created by Татьяна on 02.10.2016.
 */
public class Solver {
    public static double calculateMonthlyPayment(double amount, double prepayment, double rate, int countOfMonth) {
        double P = rate / 100 / 12;
        double amountOfCredit = calculateAmountOfCredit(amount, prepayment);
        return amountOfCredit * (P + P / (Math.pow(1 + P, countOfMonth) - 1));
    }

    public static double calculateOverpayment(double amount, double prepayment, double rate, int countOfMonth) {
        double monthlyPayment = calculateMonthlyPayment(amount, prepayment, rate, countOfMonth);
        double amountOfCredit = calculateAmountOfCredit(amount, prepayment);
        return monthlyPayment * countOfMonth - amountOfCredit;
    }

    public static double calculateInitialFee(double amount, double prepayment) {
        return amount * prepayment / 100;
    }

    public static double calculateAmountOfCredit(double amount, double prepayment) {
        return amount - calculateInitialFee(amount, prepayment);
    }

    public static String printResult(String line, double result) {
        int indexBeforeDigit = line.lastIndexOf("_");
        String newLine = line.substring(0, indexBeforeDigit + 1);
        return newLine + new BigDecimal(result).setScale(2, BigDecimal.ROUND_CEILING);
    }

    public static double calculateEffectiveRate(double rate) {
        return rate;
    }
}

