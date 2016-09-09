package com.courses.spalah;

import java.util.Date;

/**
 * Created by Roman Kurilko on 16.07.2016.
 */
public class Deposit {
    public double Sum;
    public double Percent;
    public String FirstName;
    public String LastName;
    //public String SecondName;
    public String Currency;
    public int type;
    //public Date CreateDate;
    //public Date EndDate;
    public Deposit () {

    }
    public Deposit (double Sum, double Percent, String FirstName, String LastName, String Currency, int type) {
        this.Sum = Sum;
        this.Percent = Percent;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Currency = Currency;
        this.type = type;
    }
    public double CalculateBenefitOfClient (int Month, int type) {
        double result = this.Sum;
        if(type == 1) {
            if(Month/12 < 1)
                return this.Sum * this.Percent * Month;
            else {
                int years = (int)Math.floor(Month/12);
                int months = (int)Math.floor(Month%12);
                for(int i=0;i<years;i++)
                    result = result + (result*(100%+this.Percent));
                if(months>0)
                    result = result + (result*(100%+this.Percent))/months;
                return result-this.Sum;
            }
        }
        if(type == 2)
            return this.Sum * this.Percent * (Month/12);
        return 0.0;
    }

}
