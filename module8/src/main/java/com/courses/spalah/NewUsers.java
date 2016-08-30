package com.courses.spalah;

/**
 * Created by Rita on 30.07.2016.
 */
public class NewUsers {
    private String userName;
    private int userBalance;

   public NewUsers(String userName, int userBalance) {
        this.userName = userName;
        this.userBalance = userBalance;
    }

    public void setUserBalance(int userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserBalance() {
        return userBalance;
    }

    @Override
    public String toString() {
        return "NewUsers{" +
                "userName='" + userName + '\'' +
                ", userBalance=" + userBalance +
                '}';
    }

}


