package com.courses.spalah.HomeWork;

/**
 * Created by Татьяна on 02.10.2016.
 */
public class FormCommander {
    Solver solver = new Solver();
    private double amount;
    private double prepayment;
    private double rate;
    private int time;


    private void getData(ClientForm clientForm) {
        amount = Double.parseDouble(clientForm.getAmountField().getText());
        prepayment = Double.parseDouble(clientForm.getPrepaymentField().getText());
        rate = Double.parseDouble(clientForm.getRateField().getText());
        time = Integer.parseInt(clientForm.getTimeField().getText());
    }

    public void calcMonthlyPayment(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateMonthlyPayment(amount, prepayment, rate, time);
        clientForm.getMonthlyPaymentLbl().setText(solver.printResult(clientForm.getMonthlyPaymentLbl().getText(), result));
    }

    public void calcInitialFee(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateInitialFee(amount, prepayment);
        clientForm.getInitialFeeLbl().setText(solver.printResult(clientForm.getInitialFeeLbl().getText(), result));
    }

    public void calcAmountOfCredit(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateAmountOfCredit(amount, prepayment);
        clientForm.getAmountOfCreditLbl().setText(solver.printResult(clientForm.getAmountOfCreditLbl().getText(), result));
    }

    public void calcOverpayment(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateOverpayment(amount, prepayment, rate, time);
        clientForm.getOverpaymentLbl().setText(solver.printResult(clientForm.getOverpaymentLbl().getText(), result));
    }

    public void calcInterestExpenses(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateOverpayment(amount, prepayment, rate, time);
        clientForm.getInterestExpensesLbl().setText(solver.printResult(clientForm.getInitialFeeLbl().getText(), result));
    }

    public void calcEffectiveRate(ClientForm clientForm) {
        getData(clientForm);
        double result = solver.calculateEffectiveRate(rate);
        clientForm.getEffectiveRateLbl().setText(solver.printResult(clientForm.getEffectiveRateLbl().getText(), result));
    }
}
