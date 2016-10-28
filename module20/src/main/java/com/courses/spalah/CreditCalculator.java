package com.courses.spalah;

import java.lang.Math;

/**
 * Created by Roman on 20.10.2016.
 */
public class CreditCalculator {
    public CreditAnnuity creditAnnuity;
    private double sumOfCredit;
    private double rateYear;
    private int termsMonth;
    private double oneTimeComission;
    private double monthlyComission;
    public CreditCalculator(double sumOfCredit, double rateYear, int termsMonth, double oneTimeComission, double monthlyComission) {
        this.sumOfCredit = sumOfCredit;
        this.rateYear = rateYear;
        this.termsMonth = termsMonth;
        this.oneTimeComission = oneTimeComission;
        this.monthlyComission = monthlyComission;
        this.creditAnnuity = new CreditAnnuity(this.sumOfCredit, this.rateYear, this.termsMonth, this.oneTimeComission,this.monthlyComission);
    }

    public double getEffectiveRate () {
        int year = termsMonth/12;
        /*return sumOfCredit*((Math.pow(1+rateYear,year-1)/(rateYear*year/12))-
                ((Math.pow(1+rateYear/12,year-1)/(rateYear/12))/(year*(1-Math.pow(1+rateYear/12,year)))));*/
        return Math.pow(creditAnnuity.getKoefficient(),-12)-1;
    }
    public double getOverpayment() {
        double temp = creditAnnuity.getAnnuityPay()*creditAnnuity.getTermsMonth()-creditAnnuity.getSumOfCredit()+creditAnnuity.getOneTimeComission();
        return temp;
    }
    public double getAnnuityPay () {
        return creditAnnuity.getAnnuityPayWithoutComission();
    }

}

