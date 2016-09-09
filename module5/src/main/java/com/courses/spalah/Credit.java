package main.java.com.courses.spalah;

/**
 * Created by Роман on 15.08.2016.
 */
public class Credit {
    public double sumCredit = 0;
    public double annualRate = 0;
    public double oneTimePaymentBody = 0;
    public int years = 0;
    public String FirstName;
    public String LastName;
    public Credit () {

    }
    public Credit (double sumCredit, double annualRate, String FirstName, String LastName) {
        this.sumCredit = sumCredit;
        this.annualRate = annualRate;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public double CalculateDebtOfClient (int Months, int type) {
        double result, remains;
        remains = (-1)*this.sumCredit;
        this.oneTimePaymentBody = this.sumCredit/Months;
        result = 0;
        if(type == 1) {
            for(int i = 0;i<Months;i++) {
                result = (result + ((-1)*remains*(this.annualRate)));
                remains = remains + this.oneTimePaymentBody;
            }
            return result+this.sumCredit;
        }
        if(type == 2) return this.sumCredit * this.annualRate * (Months / 12);
        return 0.0;
    }
}
