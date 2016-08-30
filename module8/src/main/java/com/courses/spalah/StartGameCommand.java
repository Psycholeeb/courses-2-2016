package com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Jeka on 29.07.2016.
 */
public class StartGameCommand extends Command {
    private ArrayList<NewUsers> newUsersList;
    private ArrayList<Bets> betsArrayList;
    private Roulette roulette;


    @Override
    public void execute() {
        newUsersList = getRouletteTable().getNewUsersList();
        betsArrayList = getRouletteTable().getBetsList();
        roulette = new Roulette();
        startGame();
        resultGame();
        System.out.println("Сделайте ставку. Пример: \"BET Ivan 50 RED\"");
    }

    public void startGame() {
        if (getArguments()[0].equals("START_GAME")) {
            roulette.generate();
            roulette.print();
        }
    }

    public void resultGame() {
        for (int i = 0; i < betsArrayList.size(); i++) {
            if (betsArrayList.get(i).getTypeBets().equals("STRAIGHT_UP")) {
                if (betsArrayList.get(i).getNumCell() == roulette.getRand()) {
                    if (newUsersList.get(i).getUserName().equals(betsArrayList.get(i).getNameUser())) {
                        newUsersList.get(i).setUserBalance((int) (betsArrayList.get(i).getBetSize() * 35));
                    }
                } else {
                    if (newUsersList.get(i).getUserName().equals(betsArrayList.get(i).getNameUser())) {
                        newUsersList.get(i).setUserBalance((int) (newUsersList.get(i).getUserBalance()
                                - betsArrayList.get(i).getBetSize()));
                    }
                }
                } else {
                    if ((int) (roulette.getRand() % 2) == 0) {
                    if (betsArrayList.get(i).getTypeBets().equals("EVEN")) {
                        if (betsArrayList.get(i).getNumCell() == roulette.getRand()) {
                            if (newUsersList.get(i).getUserName().equals(betsArrayList.get(i).getNameUser())) {
                                newUsersList.get(i).setUserBalance((int) (betsArrayList.get(i).getBetSize() * 2));
                            }
                        }
                    }
                } else {
                    if (betsArrayList.get(i).getTypeBets().equals("ODD")) {
                        if (betsArrayList.get(i).getNumCell() == roulette.getRand()) {
                            if (newUsersList.get(i).getUserName().equals(betsArrayList.get(i).getNameUser())) {
                                newUsersList.get(i).setUserBalance((int) (betsArrayList.get(i).getBetSize() * 2));
                            }
                        }
                    } else {
                        newUsersList.get(i).setUserBalance((int) (newUsersList.get(i).getUserBalance()
                                - betsArrayList.get(i).getBetSize()));
                    }
                }
            }
            if ((int) (roulette.getRand()) > 18) {
                if (betsArrayList.get(i).getTypeBets().equals("BIG")) {
                    if (betsArrayList.get(i).getNumCell() == roulette.getRand()) {
                        newUsersList.get(i).setUserBalance((int) (betsArrayList.get(i).getBetSize() * 2));
                    }
                }
            } else {
                if ((int) (roulette.getRand()) < 18) {
                    if (betsArrayList.get(i).getTypeBets().equals("SMALL")) {
                        if (betsArrayList.get(i).getNumCell() == roulette.getRand()) {
                            newUsersList.get(i).setUserBalance((int) (betsArrayList.get(i).getBetSize() * 2));
                        }
                    }
                }else {
                    newUsersList.get(i).setUserBalance((int) (newUsersList.get(i).getUserBalance()
                            - betsArrayList.get(i).getBetSize()));
                }
            }
        }
        getRouletteTable().cleanBets();
        getRouletteTable().setNewUsersList(newUsersList);
        for (NewUsers newUsers : newUsersList) {
            System.out.println(newUsers.toString());
        }
    }
}



