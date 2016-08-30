package com.courses.spalah;

/**
 * Created by Rita on 30.07.2016.
 */
public class Bets {
    private String nameUser;
    private double betSize;
    private String typeBets;
    private int numCell;

    public Bets(String nameUser, double betSize, String typeBets) {
        this.nameUser = nameUser;
        this.betSize = betSize;
        this.typeBets = typeBets;
    }

    public Bets(String nameUser, double betSize, String typeBets, int numCell) {
        this.nameUser = nameUser;
        this.betSize = betSize;
        this.typeBets = typeBets;
        this.numCell = numCell;
    }

    public double getBetSize() {
        return betSize;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getTypeBets() {
        return typeBets;
    }

    public int getNumCell() {
        return numCell;
    }
}
