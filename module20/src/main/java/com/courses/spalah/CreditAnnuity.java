package com.courses.spalah;

import java.lang.Math;

/**
 * Created by Roman on 20.10.2016.
 */
public class CreditAnnuity {
    private double sumOfCredit;
    private double rateYear;
    private int termsMonth;
    private final double TAU = 0.083333333333333;
    private double oneTimeComission;
    private double monthlyComission;
    private double Koefficient;
    private double annuityPay;
    private double annuityPayWithoutComission;

    public CreditAnnuity(double sumOfCredit, double rateYear, int termsMonth, double oneTimeComission, double monthlyComission) {
        this.sumOfCredit = sumOfCredit;
        this.rateYear = rateYear;
        this.termsMonth = termsMonth;
        this.oneTimeComission = oneTimeComission;
        this.monthlyComission = monthlyComission;
        this.annuityPayWithoutComission = this.rateYear*this.TAU*this.sumOfCredit/(1-Math.pow(1+this.rateYear*this.TAU, (-1)*this.termsMonth));
        this.annuityPay = this.annuityPayWithoutComission+(this.sumOfCredit*monthlyComission);
        setKoefficient ();
    }

    public double getNextKoefficient (int terms, double first, double second, double last) {
        return last-(first*Math.pow(last,terms+1)-last+second)/(first*(terms+1)*Math.pow(last,terms)-1);
    }
    public void setKoefficient () {
        double [] koeffs = new double [8];
        koeffs [0] = this.annuityPay/(this.sumOfCredit-this.oneTimeComission+this.annuityPay);
        koeffs [1] = 1-koeffs [0];
        for(int i=2;i<koeffs.length;i++) {
            koeffs[i] = getNextKoefficient(this.termsMonth, koeffs[0], koeffs[1], koeffs[i - 1]);
        }
        this.Koefficient = koeffs[7];
    }

    public double getAnnuityPay() {
        return annuityPay;
    }

    public double getKoefficient() {
        return Koefficient;
    }

    public double getAnnuityPayWithoutComission() {
        return annuityPayWithoutComission;
    }

    public double getSumOfCredit() {
        return sumOfCredit;
    }

    public int getTermsMonth() {
        return termsMonth;
    }

    public double getOneTimeComission() {
        return oneTimeComission;
    }
}
