package com.courses.spalah;

/**
 * Created by Jeka on 29.07.2016.
 */
public class StartGameCommand extends Command {
    private Roulette roulette;
    private Table table;
    private Cell winningCell;
    private Player player;
    private Bets bets;

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
            if (playerBet.equals(bets.STRAIGHT_UP) && bet.getBetNamber() == winningCell.getNumber()) {
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
