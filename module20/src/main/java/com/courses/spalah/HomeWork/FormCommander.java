package com.courses.spalah.HomeWork;

/**
 * Created by Татьяна on 02.10.2016.
 */
public class FormCommander {
   private Solver solver = new Solver();
   private CreditData creditData;


    public void calcMonthlyPayment(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateMonthlyPayment(creditData.getAmount(), creditData.getPrepayment(), creditData.getRate(), creditData.getTime());
        clientForm.getMonthlyPaymentLbl().setText(solver.printResult(clientForm.getMonthlyPaymentLbl().getText(), result));
    }

    public void calcInitialFee(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateInitialFee(creditData.getAmount(), creditData.getPrepayment());
        clientForm.getInitialFeeLbl().setText(solver.printResult(clientForm.getInitialFeeLbl().getText(), result));
    }

    public void calcAmountOfCredit(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateAmountOfCredit(creditData.getAmount(), creditData.getPrepayment());
        clientForm.getAmountOfCreditLbl().setText(solver.printResult(clientForm.getAmountOfCreditLbl().getText(), result));
    }

    public void calcOverpayment(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateOverpayment(creditData.getAmount(), creditData.getPrepayment(), creditData.getRate(), creditData.getTime());
        clientForm.getOverpaymentLbl().setText(solver.printResult(clientForm.getOverpaymentLbl().getText(), result));
    }

    public void calcInterestExpenses(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateOverpayment(creditData.getAmount(), creditData.getPrepayment(), creditData.getRate(), creditData.getTime());
        clientForm.getInterestExpensesLbl().setText(solver.printResult(clientForm.getInitialFeeLbl().getText(), result));
    }

    public void calcEffectiveRate(ClientForm clientForm) {
        creditData = new CreditData(clientForm);
        double result = solver.calculateEffectiveRate(creditData.getRate());
        clientForm.getEffectiveRateLbl().setText(solver.printResult(clientForm.getEffectiveRateLbl().getText(), result));
    }
}
