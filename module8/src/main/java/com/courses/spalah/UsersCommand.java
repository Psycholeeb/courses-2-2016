package com.courses.spalah;

/**
 * Created by artem on 09.08.2016.
 */
public class UsersCommand extends Command {

    @Override
    public void execute() {
        ConsoleRoulette.table.print();
        System.out.println();
        System.out.println("Casino balance: " + ConsoleRoulette.table.getCasinoBalance());
    }
}
