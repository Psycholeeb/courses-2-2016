package com.courses.spalah.bank;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Credit {
    private double sumOfCredit;
    private float annualPercent;
    private int countOfYears;

    public Credit(double sumOfCredit, float annualPercent, int countOfYears) {
        this.sumOfCredit = sumOfCredit;
        this.annualPercent = annualPercent;
        this.countOfYears = countOfYears;
    }

    public double calculateDebt() {

        return sumOfCredit + (sumOfCredit * annualPercent / 100) * countOfYears;
    }

    public double getSumOfCredit() {
        return sumOfCredit;
    }

    public float getAnnualPercent() {
        return annualPercent;
    }

    public int getCountOfYears() {

        return countOfYears;
    }
}
