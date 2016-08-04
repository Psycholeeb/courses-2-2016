package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class StartGameCommand extends Command {
    Roulette roulette;
    Table table;
    Cell cell;

    @Override
    public void execute() {
        roulette = getRoulette();
        table = getTable();
        cell = roulette.getWinningCell();
        System.out.println("Winning cell:"+ cell);
        roulette.setWinningBets(cell);
        table.getBets().clear();
        roulette.getWinningBets().clear();

    }
}
