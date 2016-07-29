package com.courses.spalah;

/**
 * Created by Rita on 24.07.2016.
 */
public class Credit {
   private double amountCredit;
   private double annualPercent;
   private double durationCredit;

    public double getAmountCredit() {

        return amountCredit;
    }

    public double getAnnualPercent() {

        return amountCredit;
    }

    public double getDurationCredit() {

        return amountCredit;
    }

    public void setAmountCredit(double amountCredit) {

        this.amountCredit = amountCredit;
    }

    public void setAnnualPercent(double annualPercent) {

        this.annualPercent = annualPercent;
    }

    public void setDurationCredit(double durationCredit) {

        this.durationCredit = durationCredit;
    }

    protected double calculateDebt() {

        return amountCredit * annualPercent / 100 * durationCredit;
    }
}
