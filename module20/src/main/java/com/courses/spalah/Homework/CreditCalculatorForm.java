package com.courses.spalah.Homework;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by Artem Uskov on 01.10.2016.
 */
public class CreditCalculatorForm extends JFrame{

    private JPanel panel = new JPanel();
    private JTextField totalBuySumm = new JTextField("Сумма покупки");
    private JTextField prepaidPercent = new JTextField("Аванс, %");
    private JTextField oneTimeCommisionPercent = new JTextField("Одноразовая комиссия, %");
    private JTextField everyMounthCommisionPercent = new JTextField("Ежемесячная комиссия, %");
    private JTextField annualRatePercent = new JTextField("Ставка, % годовых");
    private Integer[] listOfTerms = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private JComboBox termOfCredit = new JComboBox(listOfTerms);
    private JTextField oneTimeCommisionSumm = new JTextField("Одноразовая комиссия, сумма");
    private JTextField everyMounthCommisionSumm = new JTextField("Ежемесячная комиссия, сумма");
    public static JButton calculateButton = new JButton("Рассчитать");
    private JLabel prepaidSumm = new JLabel("Первоначальный взнос - ");
    private JLabel creditSumm = new JLabel("Сумма кредита - ");
    private JLabel oneTimeCommisionPay = new JLabel("Разовые комиссионые расходы - ");
    private JLabel monthlyCommisionPay = new JLabel("Комиссионные расходы за весь срок - ");

    public CreditCalculatorForm() {
        super("Credit Calculator");
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 600);
        setResizable(true);
        setVisible(true);
        panel.setLayout(null);
        panel.add(totalBuySumm);
        totalBuySumm.setBounds(20, 20, 200, 20);

        panel.add(prepaidPercent);
        prepaidPercent.setBounds(20, 60, 200, 20);

        panel.add(oneTimeCommisionPercent);
        oneTimeCommisionPercent.setBounds(20, 100, 200, 20);

        panel.add(everyMounthCommisionPercent);
        everyMounthCommisionPercent.setBounds(20, 140, 200, 20);

        panel.add(annualRatePercent);
        annualRatePercent.setBounds(240, 20, 200, 20);

        panel.add(termOfCredit);
        termOfCredit.setBounds(240, 60, 200, 20);

        panel.add(oneTimeCommisionSumm);
        oneTimeCommisionSumm.setBounds(240,100, 200, 20);

        panel.add(everyMounthCommisionSumm);
        everyMounthCommisionSumm.setBounds(240, 140, 200, 20);

        panel.add(calculateButton);
        calculateButton.setBounds(170, 170, 120, 30);

        panel.add(prepaidSumm);
        prepaidSumm.setBounds(20, 220, 300, 20);

        panel.add(creditSumm);
        creditSumm.setBounds(20, 240, 300, 20);

        panel.add(oneTimeCommisionPay);
        oneTimeCommisionPay.setBounds(20, 260, 300, 20);

        panel.add(monthlyCommisionPay);
        monthlyCommisionPay.setBounds(20, 280, 300, 20);


        calculateButton.addActionListener(new ActionListener() {
            CalculationManager calculationManager;

            @Override
            public void actionPerformed(ActionEvent e) {
                calculationManager = new CalculationManager();
                calculationManager.setVariables();

                setPrepaidSumm(calculationManager.calculatePrepaidSumm(getTotalBuySumm(), getPrepaidPercent()));
                setCreditSumm(calculationManager.calculateCreditSumm(getTotalBuySumm(), calculationManager.getPrepaidSumm()));
                calculationManager.calculateOneTimeCommision();
                calculationManager.calculateMonthlyCommision();

            }
        });

        add(panel);

    }

    public float getTotalBuySumm() {
        return Float.parseFloat(totalBuySumm.getText());
    }

    public float getPrepaidPercent() {
        return Float.parseFloat(prepaidPercent.getText());
    }

    public float getOneTimeCommisionPersent() {
        return Float.parseFloat(oneTimeCommisionPercent.getText());
    }

    public float getEveryMounthCommisionPercent() {
        return Float.parseFloat(everyMounthCommisionPercent.getText());
    }

    public float getAnnualRatePercent() {
        return Float.parseFloat(annualRatePercent.getText());
    }

    public Integer getTermOfCredit() {
        return listOfTerms[termOfCredit.getSelectedIndex()];
    }

    public float getOneTimeCommisionSumm() {
        return Float.parseFloat(oneTimeCommisionSumm.getText());
    }

    public float getEveryMonthCommisionSumm() {
        return Float.parseFloat(everyMounthCommisionSumm.getText());
    }

    public void setPrepaidSumm(float summ) {
        prepaidSumm.setText("Первоначальный взнос - "+ summ);
    }

    public void setCreditSumm(float summ) {
        creditSumm.setText("Сумма кредита - " + summ);
    }

    public void setOneTimeCommisionPay(float summ) {
        oneTimeCommisionPay.setText("Разовые комиссионые расходы - " + summ);
    }

    public void setMonthlyCommitionPay(float summ) {
        monthlyCommisionPay.setText("Комиссионные расходы за весь срок - " + summ);
    }


}
