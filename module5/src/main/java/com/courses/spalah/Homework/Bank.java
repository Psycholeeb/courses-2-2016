package com.courses.spalah.Homework;

/**
<<<<<<< HEAD
 * Created by admin on 19.07.2016.
 */
public class Bank {
    String nameOfBank;
    Deposit deposit1;
    Deposit deposit2;
    Deposit deposit3;

    public void main(String[] args){

        System.out.print(paymentOfDeposit(3));
    }

    public Bank (String nameOfBankFromConstructor){
        nameOfBank = nameOfBankFromConstructor;
        deposit1 = new Deposit(100, 15, "Ann");
        deposit2 = new Deposit(200, 13, "Poul");
        deposit3 = new Deposit(300, 11, "Sam");
    }

    public float paymentOfDeposit(int n){
        float payment = deposit1.getProfit(n) + deposit2.getProfit(n) + deposit3.getProfit(n);
        return payment;

    }
}
