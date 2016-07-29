package com.courses.spalah.Homework.bank;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
class Deposit {
    private float contribution;
    private float persent;
    private String clientName;

    public Deposit(float contribution, float persent, String clientName){
        this.contribution = contribution;
        this.persent = persent;
        this.clientName = clientName;
    }

    float getProfit(int n) {
        float profit = 0;
        for(int i=1; i == n; i++){
            profit = contribution * persent / 100;
            contribution += profit;
        }
        return profit;
    }

    float getPersent(){
        return persent;
    }

    float getContribution(){
        return contribution;
    }

    public String getClientName (){
        return clientName;
    }

    void setClientName (String clientName){
        this.clientName = clientName;
    }
}
