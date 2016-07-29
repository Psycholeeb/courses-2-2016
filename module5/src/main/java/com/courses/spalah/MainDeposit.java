package com.courses.spalah;

/**
 * Created by Rita on 24.07.2016.
 */
public class MainDeposit {
    public static void main (String [] args){
        Deposit deposit = new Deposit();
        deposit.setAmountDeposit(223598);
        deposit.setInterestRate(23);
        deposit.setNameClient("Yura");
        System.out.println(deposit.calculationProfits(2));
    }
}
