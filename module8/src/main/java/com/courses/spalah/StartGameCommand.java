package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class StartGameCommand extends Command {
    Roulette roulette;
    Table table;
    Cell cell;
    Bet bet;
    Bets bets;
    Player player;

    @Override
    public void execute() {
        roulette = getRoulette();
        roulette.printWinningCell();
        cell = roulette.getWinningCell();
        table = getTable();
        table.getBets().clear();

    }
}
