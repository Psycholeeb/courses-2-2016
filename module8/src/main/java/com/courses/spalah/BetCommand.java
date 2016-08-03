package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class BetCommand extends Command {
    Table table;

    @Override
    public void execute() {
        String[] arguments = getArguments();
        table = getTable();
        table.addBet(arguments[1], Integer.parseInt(arguments[2]), arguments[3]);

    }
}
