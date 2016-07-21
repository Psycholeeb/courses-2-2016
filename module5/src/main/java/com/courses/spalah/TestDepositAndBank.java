package com.courses.spalah;

/**
 * Created by rprudnikov on 21.07.2016.
 */
public class TestDepositAndBank {
    public static void main(String[] args) {
        Deposit depo=new Deposit(10000, 12, "Igor");
        System.out.println(depo.clientName+"'s deposit:"+" "+depo.calc(1));
        Bank newbank=new Bank("\"Igor and partners\"");
        System.out.println("Total amount "+newbank.bankName+" owes for 3 deposits: "+newbank.moneyCalc(1));
            }
}
