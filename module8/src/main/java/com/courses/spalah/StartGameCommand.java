package com.courses.spalah;

/**
 * Created by Artem Uskov on 12.08.2016.
 */

public class StartGameCommand extends Command {
    private User user;
    private boolean userWin;
    private int casinoProfit;
    Table table;
    @Override
    public void execute() {
        System.out.println("КРУТИМ РУЛЕТКУ");
        table = ConsoleRoulette.table;
        Cell cell = new Cell();
        cell = roulette.spinRoulette();
        boolean isRed = cell.getIsRed();
        int winNumber = cell.getCellNumber();
        casinoProfit = 0;
        System.out.print("Winning number = ");
        cell.print();
        System.out.println();
        for (int i = 0; i < table.getUserCount(); i++) {
            user = table.getUser(i);
            userWin = false;
            if(user.getIsBet()) {
                if(user.getBetType().equalsIgnoreCase("RED") & isRed) {
                    playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("BLACK") & !isRed & winNumber != 0) {
                    playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("EVEN") & (winNumber % 2) == 0 & winNumber != 0) {
                   playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("ODD") & (winNumber % 2) == 1) {
                   playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("SMALL") & winNumber > 0 & winNumber < 19) {
                   playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("BIG") & winNumber > 18 & winNumber < 37) {
                   playerWin();
                }
                if(user.getBetType().equalsIgnoreCase("STRAIGHT_UP") & winNumber == user.getBetNumber()) {
                  playerWin();
                }
                if (!userWin) {
                  playerLose();
                }
            }
        }
        System.out.println("Casino: +" + casinoProfit + ", balance: " + table.getCasinoBalance());
        ConsoleRoulette.table = table;
    }

    public void playerWin() {
        if(user.getBetType().equalsIgnoreCase("STRAIGHT_UP")){
            user.setBalance(user.getBalance() + 35 * user.getCurrentBet());
        }
        else {
            user.setBalance(user.getBalance() + 2 * user.getCurrentBet());
        }
        System.out.println("Player win: " + user.getName() + " +" + user.getCurrentBet() + "$ " + "balance: " + user.getBalance() + "$");
        userWin = true;
        user.setIsBet(false);
    }

    public void playerLose() {
        user.setIsBet(false);
        table.setCasinoBalance(table.getCasinoBalance() + user.getCurrentBet());
        System.out.println("Player lose: " + user.getName() + " -" + user.getCurrentBet() + "$, " + "balance: " + user.getBalance() + "$");
        casinoProfit = casinoProfit + user.getCurrentBet();
    }
}
