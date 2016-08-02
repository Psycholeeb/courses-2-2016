package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Татьяна on 02.08.2016.
 */
public class Table {
    ArrayList<Player> players = new ArrayList<>();

    public void addToTable(String name, int balance) {
        if (players.size() < 5) {
            players.add(new Player(name, balance));
        }
        else{
            System.out.println("There are no place!");
        }
    }
}
