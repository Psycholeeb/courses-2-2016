package com.courses.spalah.Homework.bank;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
class Credit {
    private float currentCredit;
    private float persentPerYear;
    private int yearsOfCredit;

    public Credit(float currentCredit, float persentPerYear, int yearsOfCredit){
        this.currentCredit = currentCredit;
        this.persentPerYear = persentPerYear;
        this.yearsOfCredit = yearsOfCredit;
    }

    float getCreditAmount(float persentPerYear, float currentCredit, int yearsOfCredit){

          return currentCredit + (currentCredit * persentPerYear / 100 * yearsOfCredit);
    }

    float getCurrentCredit(){
        return currentCredit;
    }

    float getPersentPerYear(){
        return persentPerYear;
    }

    int getYearsOfCredit(){
        return yearsOfCredit;
    }
}
