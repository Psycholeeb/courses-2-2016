package com.courses.spalah;

/**
 * Created by rprudnikov on 25.07.2016.
 */
public class Credit {
    private double creditAmount;
    private double creditPercent;
    private double creditYears;

    public double calculateCredit() {
        double creditToPay = creditAmount * (creditPercent / 100) * creditYears+creditAmount;
        return creditToPay;
    }

    public Credit(int creditAmount, int creditPercent, int creditYear) {
        this.creditAmount = creditAmount;
        this.creditPercent = creditPercent;
        this.creditYears = creditYear;
    }
}
