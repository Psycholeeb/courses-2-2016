package com.courses.spalah;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by Rita on 17.07.2016.
 */
public class Deposit {
    private double amountDeposit;
    private double interestRate;
    private String nameClient;

   /* Deposit (double amountDeposit, double interestRate, String nameClient){
       this.amountDeposit = amountDeposit;
       this.interestRate = interestRate;
       this.nameClient = nameClient;
    }
*/
    public double getAmountDeposit() {

        return amountDeposit;
    }

    public double getInterestRate() {

        return interestRate;
    }

    public String getNameClient() {

        return nameClient;
    }

    public void setAmountDeposit(double amountDeposit) {

        this.amountDeposit = amountDeposit;
    }

    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;
    }

    public void setNameClient(String nameClient) {

        this.nameClient = nameClient;
    }

    protected String calculationProfits (int year) {
        for (int i = 0; i < year; i++){
            amountDeposit += amountDeposit * interestRate / 100;
        }
        return nameClient + ", твой депозит через " + year + " года будет составлять " + amountDeposit;
    }
}
