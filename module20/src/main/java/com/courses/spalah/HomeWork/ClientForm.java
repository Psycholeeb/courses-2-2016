package com.courses.spalah.HomeWork;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Татьяна on 02.10.2016.
 */
public class ClientForm {
    private JPanel jPanel = new JPanel();
    private JTextField amountField;
    private JTextField rateField;
    private JTextField prepaymentField;
    private JTextField timeField;
    private JButton resultBtn;
    private JLabel initialFeeLbl;
    private JLabel amountOfCreditLbl;
    private JLabel monthlyPaymentLbl;
    private JLabel interestExpensesLbl;
    private JLabel overpaymentLbl;
    private JLabel effectiveRateLbl;
    private final static int DISTANCE_BETWEEN_COMPONENTS_X = 250;
    private final static int DISTANCE_BETWEEN_COMPONENTS_Y = 60;

    JPanel createPanel() {
        jPanel.setLayout(null);
        jPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        amountField = createTextField("Purchase amount", 40, 40, jPanel);
        rateField = createTextField("Rate, %", amountField.getX() + DISTANCE_BETWEEN_COMPONENTS_X, amountField.getY(), jPanel);
        prepaymentField = createTextField("Prepayment, %", amountField.getX(), amountField.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        timeField = createTextField("Time, month", prepaymentField.getX() + DISTANCE_BETWEEN_COMPONENTS_X, prepaymentField.getY(), jPanel);
        resultBtn = createBtn("Calculate", prepaymentField.getX(), prepaymentField.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);

        initialFeeLbl = createResultLabel("Initial fee_______________________0", resultBtn.getX(), resultBtn.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        amountOfCreditLbl = createResultLabel("Amount of credit_________________0", initialFeeLbl.getX(), initialFeeLbl.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        monthlyPaymentLbl = createResultLabel("Monthly payment_________________0", amountOfCreditLbl.getX(), amountOfCreditLbl.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        interestExpensesLbl = createResultLabel("Interest expenses________________0", monthlyPaymentLbl.getX(), monthlyPaymentLbl.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        overpaymentLbl = createResultLabel("Overpayment____________________0", interestExpensesLbl.getX(), interestExpensesLbl.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        effectiveRateLbl = createResultLabel("Effective rate, %__________________0", overpaymentLbl.getX(), overpaymentLbl.getY() + DISTANCE_BETWEEN_COMPONENTS_Y, jPanel);
        return jPanel;
    }

    private JTextField createTextField(String text, int xPosition, int yPosition, JPanel panel) {
        JLabel jLabel = new JLabel(text);
        jLabel.setSize(120, 30);
        jLabel.setLocation(xPosition, yPosition - 30);
        JTextField jTextField = new JFormattedTextField();
        jTextField.setSize(120, 30);
        jTextField.setLocation(xPosition, yPosition);
        panel.add(jLabel);
        return (JTextField) panel.add(jTextField);
    }

    private JLabel createResultLabel(String text, int xPosition, int yPosition, JPanel panel) {
        JLabel jLabel = new JLabel(text);
        jLabel.setLocation(xPosition, yPosition);
        jLabel.setSize(300, 30);
        return (JLabel) panel.add(jLabel);
    }

    private JButton createBtn(String text, int xPosition, int yPosition, JPanel panel) {
        JButton jButton = new JButton(text);
        jButton.setLocation(xPosition, yPosition);
        jButton.setSize(120, 30);
        return (JButton) panel.add(jButton);
    }

    public JTextField getAmountField() {
        return amountField;
    }

    public JTextField getRateField() {
        return rateField;
    }

    public JTextField getPrepaymentField() {
        return prepaymentField;
    }

    public JTextField getTimeField() {
        return timeField;
    }

    public JButton getResultBtn() {
        return resultBtn;
    }

    public JLabel getMonthlyPaymentLbl() {
        return monthlyPaymentLbl;
    }

    public JLabel getInterestExpensesLbl() {
        return interestExpensesLbl;
    }

    public JLabel getOverpaymentLbl() {
        return overpaymentLbl;
    }

    public JLabel getEffectiveRateLbl() {
        return effectiveRateLbl;
    }

    public JLabel getInitialFeeLbl() {
        return initialFeeLbl;
    }

    public JLabel getAmountOfCreditLbl() {
        return amountOfCreditLbl;
    }
}
