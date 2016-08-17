package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class StartGameCommand extends Command {
    Roulette roulette;
    Table table;
    Cell winningCell;
    Player player;

    @Override
    public void execute() {
        roulette = getRoulette();
        table = getTable();
        winningCell = roulette.getWinningCell();
        System.out.println("Winning cell:" + winningCell);
        roulette.setWinningBets(winningCell);

        for (Bet bet : table.getBets()) {
            boolean winPlayer = false;
            Bets playerBet = bet.getBets();
            if (playerBet.equals("STRAIGHT_UP") && bet.getBetNamber() == winningCell.getNumber()) {
                player = table.getPlayerByName(bet.getPlayerName());
                player.setBalance(player.getBalance() + 35 * bet.getBetSize());
                System.out.println(bet.getPlayerName() + " +" + 35*bet.getBetSize());
            }
            for (Bets winningBet : roulette.getWinningBets()) {
                if (playerBet.equals(winningBet)) {
                    player = table.getPlayerByName(bet.getPlayerName());
                    player.setBalance(player.getBalance() + bet.getBetSize());
                    System.out.println(bet.getPlayerName() + " +" + bet.getBetSize());
                    winPlayer = true;
                    break;
                } else {
                    continue;
                }
            }
            if (winPlayer == false) {
                player = table.getPlayerByName(bet.getPlayerName());
                player.setBalance(player.getBalance() - bet.getBetSize());
                System.out.println(bet.getPlayerName() + " -" + bet.getBetSize());
            }
        }
        for (Player p : table.getPlayers()
                ) {
            System.out.println(p);
        }
        table.getBets().clear();
        roulette.getWinningBets().clear();

    }

}
