package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class BetCommand extends Command {

    @Override
    public void execute() {
        Table table = getTable();
        try {
            String userName = arguments[1];
            int bet = Integer.parseInt(arguments[2]);
            String betType = arguments[3];
            int betNumber = 0;
            if(arguments.length == 5) {
                betNumber = Integer.parseInt(arguments[4]);
            }
                ConsoleRoulette.table.addBet(userName, bet, betType, betNumber);
            } catch (Exception ex) {
                System.out.println("bet command must be:");
                System.out.println("bet [user] [betsum] [bettype] [betnumber]");
            }
    }
}
