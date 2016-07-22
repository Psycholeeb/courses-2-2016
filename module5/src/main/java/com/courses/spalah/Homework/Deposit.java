package com.courses.spalah.Homework;

/**
 * @author Ievgen Tararaka
 */
public class Deposit {
    public float contribution;
    public float persent;
    public String clientName;

    public Deposit(float contributionFromConstrutor, float persentFromConstructor, String clientNameFromConstrutor){
        contribution = contributionFromConstrutor;
        persent = persentFromConstructor;
        clientName = clientNameFromConstrutor;
    }

    public float getProfit(int n) {
        float profit = 0;
        for(int i=1; i == n; i++){
            profit = contribution * persent / 100;
            contribution = contribution + profit;
        }
        return profit;
    }

}
