package com.courses.spalah.HomeWork;

/**
 * Created by Татьяна on 09.10.2016.
 */
public class CreditData {
    private double amount;
    private double prepayment;
    private double rate;
    private int time;

    CreditData(ClientForm clientForm){
        amount = Double.parseDouble(clientForm.getAmountField().getText());
        prepayment = Double.parseDouble(clientForm.getPrepaymentField().getText());
        rate = Double.parseDouble(clientForm.getRateField().getText());
        time = Integer.parseInt(clientForm.getTimeField().getText());
    }

    public double getAmount() {
        return amount;
    }

    public double getPrepayment() {
        return prepayment;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }
}
