package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Table {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Bet> betsList = new ArrayList<>();


    public void addToTable(String name, int balance) {
        if (players.size() < 5) {
            players.add(new Player(name, balance));
            System.out.println("New user with name = " + name + " and balance = " + balance + "$ is added to table");
        } else {
            System.out.println("There are no place!");
        }
    }

    public void addBet(String playerName, int betSize, String betType) {

        for (Player player : players) {
            if (playerName.equals(player.getName()) && (player.balance - betSize > 0)) {
                betsList.add(new Bet(playerName, betSize, betType));
                System.out.println("BET ACCEPTED");
            } else {
                System.out.println("BET NOT ACCEPTED");
            }
        }

    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Bet> getBets() {
        return betsList;
    }

}
