package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public abstract class Command {
    String[] arguments;
    Roulette roulette;
    RouletteTable rouletteTable;

    public void setArguments(String[] arguments) {
        this.arguments = arguments;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setRouletteTable(RouletteTable rouletteTable) {
        this.rouletteTable = rouletteTable;
    }

    public void setRoulette(Roulette roulette) {
        this.roulette = roulette;
    }

    public Roulette getRoulette() {
        return roulette;
    }

    public RouletteTable getRouletteTable() {
        return rouletteTable;
    }

    public abstract void execute();
}
