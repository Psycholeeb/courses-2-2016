package com.courses.spalah;

public class CreditCalculatorRunner {
    public static boolean isOk = false;
    public static void main (String [] args) {
        CreditCalculator credit = new CreditCalculator(1000000,0.3,36,0.01,0.001);
        System.out.println("Аннуитетная схема погашения кредита");
        System.out.println("Ежемесячный платеж: "+(credit.getAnnuityPay()*100)+" грн");
        System.out.println("Переплата по кредиту: "+credit.getOverpayment()+" грн");
        System.out.println("Эффективная ставка: "+(credit.getEffectiveRate()*100)+" %");
        isOk = true;
    }
}
