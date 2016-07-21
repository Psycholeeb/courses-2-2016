package com.courses.spalah;
/**
 * Created by rprudnikov on 21.07.2016.
 */
public class Deposit {
    int startSum;
    int percent;
    String clientName;

    public int calc(int years) {
        int income = startSum * percent / 100 * years;
        return income;
    }

    public Deposit(int sum, int perc, String nm) {
        startSum = sum;
        percent = perc;
        clientName = nm;
    }

}


