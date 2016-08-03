package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public abstract class Command {
    String[] arguments;
    Roulette roulette;
    Table table;

    public void setArguments(String[] arguments) {

        this.arguments = arguments;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setRoulette(Roulette roulette) {
        this.roulette = roulette;
    }

    public Roulette getRoulette() {
        return roulette;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public abstract void execute();
}
