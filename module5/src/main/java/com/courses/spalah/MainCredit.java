package com.courses.spalah;

/**
 * Created by Rita on 24.07.2016.
 */
public class MainCredit {
    public static void main(String[] args) {
        Credit credit = new Credit();
        credit.setAmountCredit(5000);
        credit.setAnnualPercent(12);
        credit.setDurationCredit(3);
        System.out.println(credit.calculateDebt());
    }
}
