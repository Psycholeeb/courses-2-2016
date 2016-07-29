package com.courses.spalah.Homework.bank;

/**
 * Created by Artem Uskov on 19.07.2016.
 */
class Bank {
    public String nameOfBank;
    private Deposit deposit1;
    private Deposit deposit2;
    private Deposit deposit3;

    public void main(String[] args){

        System.out.print(paymentOfDeposit(3));
    }

    public Bank (String nameOfBank){
        this.nameOfBank = nameOfBank;
        deposit1 = new Deposit(100, 15, "Ann");
        deposit2 = new Deposit(200, 13, "Poul");
        deposit3 = new Deposit(300, 11, "Sam");
    }

    float paymentOfDeposit(int n){
        float payment = deposit1.getProfit(n) + deposit2.getProfit(n) + deposit3.getProfit(n);
        return payment;
    }
}
