package com.courses.spalah;

/**
 * Created by Rita on 17.07.2016.
 */
public class Bank {

    private String nameBank;
    private double deposit1;
    private double deposit2;
    private double deposit3;

  /* Bank(String nameBank) {
        this.nameBank = "Private";
        this.deposit1 = 10000;
        this.deposit2 = 20000;
        this.deposit3 = 25000;
    } */

    public void setNameBank(String nameBank) {

        this.nameBank = nameBank;
    }

    public double getDeposit1() {

        return deposit1;
    }

    public double getDeposit2() {

        return deposit2;
    }

    public double getDeposit3() {

        return deposit3;
    }

    public void setDeposit1(double deposit1) {

        this.deposit1 = deposit1;
    }

    public void setDeposit2(double deposit2) {

        this.deposit2 = deposit2;
    }

    public void setDeposit3(double deposit3) {

        this.deposit3 = deposit3;
    }

    protected String bankDebt(int year) {
        double rate = 30;
        double debt = 0;
        double totalAmount = deposit1 + deposit2 + deposit3;
        for (int i = 0; i < year; i++) {
            totalAmount += totalAmount * rate / 100;
            debt = totalAmount - (deposit1 + deposit2 + deposit3);
        }
        return nameBank + " через " + year + " года " + "будет должен своим вкладчикам " + debt + " гривен";
    }
}

