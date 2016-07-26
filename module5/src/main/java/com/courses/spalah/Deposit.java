package com.courses.spalah;

/**
 * Created by rprudnikov on 21.07.2016.
 */
public class Deposit {
    private int startSum;
    private int percent;
    private String clientName;

    public int calc(int years) {
        int income = startSum * percent / 100 * years;
        return income;
    }

    public Deposit(int startSum, int percent, String clientName) {
        this.startSum = startSum;
        this.percent = percent;
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }
}


