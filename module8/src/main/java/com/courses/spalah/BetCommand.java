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
        if (arguments.length == 4) {
            table.addBet(arguments[1], Integer.parseInt(arguments[2]), arguments[3]);
        }
        if (arguments.length == 5) {
            table.addBet(arguments[1], Integer.parseInt(arguments[2]), arguments[3], Integer.parseInt(arguments[4]));
        }
        table.print();
    }
}