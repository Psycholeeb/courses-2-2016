package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Table {
    Bets bets;
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Bet> betsList = new ArrayList<>();


    public void addToTable(String name, int balance) {
        if ((players.size()) < 5 && (balance > 0)) {
            players.add(new Player(name, balance));
            System.out.println("New user with name = " + name + " and balance = " + balance + "$ is added to table");
        } else {
            System.out.println("There are no place!");
        }
    }

    public void addBet(String playerName, int betSize, String betType) {

        for (Player player : players) {
            if (playerName.equals(player.getName()) && (player.balance - betSize > 0)) {
                betsList.add(new Bet(playerName, betSize, betParser(betType)));
                System.out.println("BET ACCEPTED");
            } else {
                System.out.println("BET NOT ACCEPTED");
            }
        }

    }

    public void addBet(String playerName, int betSize, String betType, int betNamber) {

        for (Player player : players) {
            if (playerName.equals(player.getName()) && (player.balance - betSize > 0)) {
                betsList.add(new Bet(playerName, betSize, betParser(betType), betNamber));
                System.out.println("BET ACCEPTED");
            } else {
                System.out.println("BET NOT ACCEPTED");
            }
        }

    }

    public Bets betParser(String betType) {
        switch (betType) {

            case "RED":
                return bets.RED;
            case "BLACK":
                return bets.BLACK;
            case "ODD":
                return bets.ODD;
            case "EVEN":
                return bets.EVEN;
            case "BIG":
                return bets.BIG;
            case "SMALL":
                return bets.SMALL;
            case "STRAIGHT_UP":
                return bets.STRAIGHT_UP;
            default:
                System.out.println("Invalid bet!");
                break;
        }
        return bets;
    }

    public boolean checkBets(String betType) {

        for (Bets bet : Bets.values()) {
            if (bet.equals(Bets.valueOf(betType))) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Bet> getBets() {
        return betsList;
    }

    public void print() {
        for (Bet bet : betsList) {
            System.out.println(bet);
        }
    }
}
