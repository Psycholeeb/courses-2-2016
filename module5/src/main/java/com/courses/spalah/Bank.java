package main.java.com.courses.spalah;

import java.io.IOException;
import com.courses.spalah.Deposit;
import main.java.com.courses.spalah.Credit;

/**
 * Created by Roman Kurilko on 16.07.2016.
 */
public class Bank {
    public Deposit deposit1 = new Deposit();//(2000.00, 0.2, "Ivan", "Ivanov", "UAH", 1);
    public Deposit deposit2 = new Deposit();//(3000.00, 0.1, "Ivan", "Ivanov", "UAH", 1);
    public Deposit deposit3 = new Deposit();//(4000.00, 0.15, "Ivan", "Ivanov", "UAH", 1);
    public Credit credit1 = new Credit();//
    public String NameOfBank;// = "Spalah Bank";
    public Bank() {

    }
    public Bank(String NameOfBank) {
        this.NameOfBank = NameOfBank;
        this.deposit1 = new Deposit(2000.00, 0.2, "Ivan", "Ivanov", "UAH", 1);
        this.deposit2 = new Deposit(3000.00, 0.1, "Petr", "Petrov", "UAH", 1);
        this.deposit3 = new Deposit(4000.00, 0.15, "Sidor", "Sidorov", "UAH", 1);
        this.credit1 = new Credit(8000.00, 0.025, "Ivan", "Danilov");
    }
    public double CalculateCostsOfBank (int years) {
        double costs1 = 0.0;
        costs1 += this.deposit1.CalculateBenefitOfClient(years*12,1);
        costs1 += this.deposit2.CalculateBenefitOfClient(years*12,1);
        costs1 += this.deposit3.CalculateBenefitOfClient(years*12,1);
        return costs1;
    }
    public double CalculateIncomeOfBank (int years) {
        double income1 = 0.0;
        income1 += this.credit1.CalculateDebtOfClient(years*12,1);
        return income1;
    }
    public static void main (String[] args) {
        Bank bank = new Bank("Spalah Bank");
        System.out.println("Costs of the \""+bank.NameOfBank+"\" is: "+round(bank.CalculateCostsOfBank(5),2)+" UAH");
        System.out.println("Income of the \""+bank.NameOfBank+"\" is: "+round(bank.CalculateIncomeOfBank(5),2)+" UAH");
        System.out.println("So, Benefit is: "+(round(bank.CalculateIncomeOfBank(5),2)-round(bank.CalculateCostsOfBank(5),2))+" UAH");

    }
    public static double round(double value, int scale) {
        return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
    }

}
