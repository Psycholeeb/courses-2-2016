package com.courses.spalah;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Bet {
    private String playerName;
    private int betSize;
    private Bets bets;
    private int betNamber;

    public Bet(String playerName, int betSize, Bets bets) {
        this.playerName = playerName;
        this.betSize = betSize;
        this.bets = bets;
    }

    public Bet(String playerName, int betSize, Bets bets, int betNamber) {
        this.playerName = playerName;
        this.betSize = betSize;
        this.bets = bets;
        this.betNamber = betNamber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getBetSize() {
        return betSize;
    }

    public Bets getBets() {
        return bets;
    }

    public int getBetNamber() {
        return betNamber;
    }


    @Override
    public String toString() {
        return "Bet{" +
                "playerName='" + playerName + '\'' +
                ", betSize=" + betSize +
                ", betType='" + bets + '\'' +
                '}';
    }
}
