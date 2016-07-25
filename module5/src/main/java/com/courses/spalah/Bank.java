package com.courses.spalah;

/**
 * Created by rprudnikov on 21.07.2016.
 */
public class Bank {
    private String bankName;
    private Deposit deposit1;
    private Deposit deposit2;
    private Deposit deposit3;

    public Bank(String bnkname) {
        bankName = bnkname;
        deposit1 = new Deposit(5000, 5, "Igor");
        deposit2 = new Deposit(10000, 10, "Max");
        deposit3 = new Deposit(12000, 12, "Ivan");
    }

    public int moneyCalc(int term) {
        int money = deposit1.calc(term) + deposit2.calc(term) + deposit3.calc(term);
        return money;
    }

    public String getBankName(){
        return bankName;
    }

}
