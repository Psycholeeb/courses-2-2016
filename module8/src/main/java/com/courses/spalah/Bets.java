package com.courses.spalah;

/**
 * Created by Татьяна on 02.08.2016.
 */
public enum Bets {
    RED, BLACK, ODD, EVEN, SMALL, BIG, STRAIGHT_UP;

    public boolean checkBets(String betType) {
        boolean check = false;
        for (Bets bet : Bets.values()) {
            if (betType.equals(bet)) {
                check = true;
            } else {
                check = false;
            }

        }
        return check;
    }
}

