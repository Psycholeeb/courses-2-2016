package com.courses.spalah;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Bet {
    String playerName;
    int betSize;
    String betType;

    public Bet(String playerName, int betSize, String betType) {
        this.playerName = playerName;
        this.betSize = betSize;
        this.betType = betType;
    }


    @Override
    public String toString() {
        return "Bet{" +
                "playerName='" + playerName + '\'' +
                ", betSize=" + betSize +
                ", betType='" + betType + '\'' +
                '}';
    }
}
