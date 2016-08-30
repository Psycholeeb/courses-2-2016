package com.courses.spalah;


import java.util.ArrayList;

public class RouletteTable {

    private ArrayList<NewUsers> newUsersList = new ArrayList<NewUsers>();
    private ArrayList<Bets> betsList = new ArrayList<Bets>();

    public void hasPlace(NewUsers newUsers) {
        if (newUsersList.size() < 5 && newUsers.getUserBalance() > 0) {
            if (checkUser(newUsers)) {
                newUsersList.add(newUsers);
                System.out.println("Игрок с именем " + newUsers.getUserName() + " и балансом "
                        + newUsers.getUserBalance() + " $ добавлен за стол");
                System.out.println("Сделайте ставку. Пример: \"BET Ivan 50 RED\"");
            } else {
                System.out.println("Игрок с таким именем уже существует");
            }
        } else {
            System.out.println("Больше нет мест!");
        }
    }

    public void addBets(Bets bets) {
        if (checkBet(bets)) {
            if (checkCountBets(bets)) {
                if (checkBalance(bets)) {
                    if (checkTypeBets(bets)) {
                        betsList.add(bets);
                        System.out.println("Ваша ставка принята");
                        System.out.println("Введите START_GAME");
                    } else {
                        System.out.println("Неправильный тип ставки. Возможные типы: RED, BLACK, ODD," +
                                " EVEN, BIG, SMALL, STRAIGHT_UP");
                    }
                } else {
                    System.out.println("На вашем балансе недостаточно средств");
                }
            } else {
                System.out.println("Вы уже сделали ставку");
            }
        } else {
            System.out.println("Ставка не принята. Игрока стаким именем не существует");
        }
    }

    public boolean checkBet(Bets bets) {
        for (NewUsers checkUsers : newUsersList) {
            if (checkUsers.getUserName().equals(bets.getNameUser())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUser(NewUsers newUsers) {
        for (NewUsers checkUsersName : newUsersList) {
            if (checkUsersName.getUserName().equals(newUsers.getUserName())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkCountBets(Bets bets) {
        int countBets = 0;
        for (Bets betsCount : betsList) {
            if (betsCount.getNameUser().equals(bets.getNameUser())) {
                countBets++;
            }
        }
        if (countBets >= 1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkBalance(Bets bets) {
        for (NewUsers balanceUser : newUsersList) {
            if (balanceUser.getUserBalance() > 1 && balanceUser.getUserBalance() >= bets.getBetSize()
                    && balanceUser.getUserName().equals(bets.getNameUser())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTypeBets(Bets bets) {
        switch (bets.getTypeBets()) {
            case "RED":
                return true;
            case "BLACK":
                return true;
            case "ODD":
                return true;
            case "EVEN":
                return true;
            case "BIG":
                return true;
            case "SMALL":
                return true;
            case "STRAIGHT_UP":
                return true;
        }
        return false;
    }

    public void cleanBets (){
        betsList.clear();
    }

    public void setNewUsersList(ArrayList<NewUsers> newUsersList) {
        this.newUsersList = newUsersList;
    }

    public ArrayList<NewUsers> getNewUsersList() {
        return newUsersList;
    }

    public ArrayList<Bets> getBetsList() {
        return betsList;
    }
}














