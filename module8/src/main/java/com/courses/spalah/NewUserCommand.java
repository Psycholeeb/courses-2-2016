package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class NewUserCommand extends Command {
    Table table;
    @Override
    public void execute() {
        String[] arguments = getArguments();
        table = getTable();
        table.addToTable(arguments[1],Integer.parseInt(arguments[2]));
    }
}
