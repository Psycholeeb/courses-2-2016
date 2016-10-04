package com.courses.spalah.HomeWork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Татьяна on 02.10.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        ClientForm clientForm = new ClientForm();
        jFrame.setContentPane(clientForm.createPanel());
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setSize(500, 600);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        FormCommander formCommander = new FormCommander();
        clientForm.getResultBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formCommander.calcMonthlyPayment(clientForm);
                formCommander.calcInitialFee(clientForm);
                formCommander.calcAmountOfCredit(clientForm);
                formCommander.calcOverpayment(clientForm);
                formCommander.calcInterestExpenses(clientForm);
                formCommander.calcEffectiveRate(clientForm);

            }
        });
    }
}
