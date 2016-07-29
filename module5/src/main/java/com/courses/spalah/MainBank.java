package com.courses.spalah;

/**
 * Created by Rita on 24.07.2016.
 */
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setNameBank("Супер Банк");
        bank.setDeposit1(10000);
        bank.setDeposit2(20000);
        bank.setDeposit3(30000);
        System.out.println(bank.bankDebt(3));
    }
}
