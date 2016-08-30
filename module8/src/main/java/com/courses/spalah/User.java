package com.courses.spalah;

import java.util.IntSummaryStatistics;

/**
 * Created by Artem Uskov on 05.08.2016.
 */
public class User {
    private String name = "";
    private int balance = 0;
    private int currentBet = 0;
    private boolean isBet = false;
    private String betType = "";
    private int betNumber;

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public void setIsBet(boolean isBet) {
        this.isBet = isBet;
    }

    public void setBetType(String betType){
        this.betType = betType;
    }

    public void setBetNumber(int betNumber) {
        this.betNumber = betNumber;
    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getCurrentBet(){
        return currentBet;
    }

    public boolean getIsBet() {
        return isBet;
    }

    public String getBetType() {
        return betType;
    }

    public int getBetNumber() {
        return betNumber;
    }

    public void print() {
        System.out.print(name + " with balance " + balance + ", isBet = " + isBet);
        if(isBet) {
            System.out.print(", current bet = " + currentBet + ", bet type - " + betType);
        }
        if(betType.equalsIgnoreCase("STRAIGHT_UP")) {
            System.out.print(", bet number = " + betNumber);
        }
        System.out.println(";");
    }
}
