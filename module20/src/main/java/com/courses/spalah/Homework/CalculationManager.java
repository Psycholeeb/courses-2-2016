package com.courses.spalah.Homework;

/**
 * Created by Artem Uskov on 03.10.2016.
 */
public class CalculationManager {

    private float totalBuySumm;
    private float prepaidPercent;
    private float oneTimeCommisionPercent;
    private float everyMounthCommisionPercent;
    private float annualRatePercent;
    private Integer termOfCredit;
    private float oneTimeCommisionSumm;
    private float everyMounthCommisionSumm;
    private float firstTimePrepaid;
    private float creditSumm;
    private float oneTimeCommision;
    private float monthlyCommision;
    private CreditCalculatorForm form = CreditCalculator.form;

    public void setVariables() {
        totalBuySumm = form.getTotalBuySumm();
        prepaidPercent = form.getPrepaidPercent();
        oneTimeCommisionPercent = form.getOneTimeCommisionPersent();
        everyMounthCommisionPercent = form.getEveryMounthCommisionPercent();
        annualRatePercent = form.getAnnualRatePercent();
        termOfCredit = form.getTermOfCredit();
        oneTimeCommisionSumm = form.getOneTimeCommisionSumm();
        everyMounthCommisionSumm = form.getEveryMonthCommisionSumm();
    }

    public float getPrepaidSumm() {
        return firstTimePrepaid;
    }

    public float calculatePrepaidSumm(float totalBuySumm, float prepaidPercent) {
        firstTimePrepaid = totalBuySumm * prepaidPercent / 100;
//        form.setPrepaidSumm(firstTimePrepaid);
        return firstTimePrepaid;
    }

    public float calculateCreditSumm(float totalBuySumm, float firstTimePrepaid) {
        creditSumm = totalBuySumm - firstTimePrepaid;
//        form.setCreditSumm(creditSumm);
        return creditSumm;
    }

    public void calculateOneTimeCommision() {
        oneTimeCommision = (creditSumm / 100 * oneTimeCommisionPercent) + oneTimeCommisionSumm;
        form.setOneTimeCommisionPay(oneTimeCommision);
    }

    public void calculateMonthlyCommision() {
        monthlyCommision = ((creditSumm * everyMounthCommisionPercent / 100) + everyMounthCommisionSumm) * termOfCredit * 12;
        form.setMonthlyCommitionPay(monthlyCommision);
    }
}
