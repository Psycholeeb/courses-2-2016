package com.courses.spalah;

import java.math.BigDecimal;

/**
 * Created by Татьяна on 30.09.2016.
 */
public class Person {
    private String name;
    private String surname;
    private String address;

    public Person() {
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Created by Татьяна on 02.10.2016.
     */
    public static class Solver {
        public double calculateMonthlyPayment(double amountOfCredit, double rate, int countOfMonth) {
            double P = rate / 100 / 12;
            return amountOfCredit * (P + P / (Math.pow(1 + P, countOfMonth) - 1));
        }

        public double calculateOverpayment(double amountOfCredit, double rate, int countOfMonth) {
            double monthlyPayment = calculateMonthlyPayment(amountOfCredit, rate, countOfMonth);
            return monthlyPayment * countOfMonth - amountOfCredit;
        }

        public double calculateInitialFee(double amount, double prepayment) {
            return amount * prepayment / 100;
        }
        public double calculateAmountOfCredit(double amount, double prepayment){
            return amount - calculateInitialFee(amount, prepayment);
        }

        public String printResult(String line, double result) {
            int indexBeforeDigit = line.lastIndexOf("_");
            String newLine = line.substring(0, indexBeforeDigit + 1);
            return newLine + new BigDecimal(result).setScale(2, BigDecimal.ROUND_CEILING);
        }
        public double calculateEffectiveRate(double rate){
            return rate;
        }
    }
}
