package com.courses.spalah.swing;

import com.courses.spalah.Calculator;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private Calculator calculator;

    public GUI() throws HeadlessException {
        calculator = new Calculator();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(210, 280));
        setResizable(false);
        setTitle("Calculator");
        JPanel panel = new JPanel(new BorderLayout());
        gui(panel);
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void gui(JPanel panel) {
        JTextArea screen = new JTextArea(1, 10);
        Font font = new Font("Verdana", Font.BOLD, 16);
        screen.setFont(font);
        screen.setEditable(false);

        JPanel buttonsPanel = new JPanel(new GridLayout(5, 4));
        JButton[] numbers = new JButton[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new JButton("" + i);
            final int finalI = i;
            numbers[i].addActionListener(e -> screen.setText(screen.getText() + numbers[finalI].getText()));
        }

        JButton clear = new JButton("C");
        clear.addActionListener(e -> {
            screen.setText("");
            this.calculator.clear();
        });

        JButton back = new JButton("<-");
        back.addActionListener(e -> {
            String text = screen.getText();
            text = text.substring(0, text.length() - 1);
            screen.setText(text);
        });

        JButton plus = new JButton(" + ");
        plus.addActionListener(e -> screen.append(plus.getText()));

        JButton sub = new JButton(" - ");
        sub.addActionListener(e -> screen.append(sub.getText()));

        JButton mult = new JButton(" * ");
        mult.addActionListener(e -> screen.append(mult.getText()));

        JButton div = new JButton(" / ");
        div.addActionListener(e -> screen.append(div.getText()));

        JButton dot = new JButton(".");
        dot.addActionListener(e -> screen.append(dot.getText()));
        JButton equ = new JButton("=");
        equ.addActionListener(e -> {
            try {
                double result = this.calculator.calculate(screen.getText().trim().split("\\s"));
                screen.setText("" + result);
            } catch (Calculator.NumberOfOperandsException | Calculator.DivisionByZeroException | Calculator.UnsupportedOperationException e1) {
                JOptionPane.showMessageDialog(this, "Ошибка!");
            }
        });

        buttonsPanel.add(clear);
        buttonsPanel.add(mult);
        buttonsPanel.add(div);
        buttonsPanel.add(back);

        buttonsPanel.add(numbers[7]);
        buttonsPanel.add(numbers[8]);
        buttonsPanel.add(numbers[9]);
        buttonsPanel.add(new Button(" "));

        buttonsPanel.add(numbers[4]);
        buttonsPanel.add(numbers[5]);
        buttonsPanel.add(numbers[6]);
        buttonsPanel.add(plus);

        buttonsPanel.add(numbers[1]);
        buttonsPanel.add(numbers[2]);
        buttonsPanel.add(numbers[3]);
        buttonsPanel.add(sub);

        buttonsPanel.add(new Button(" "));
        buttonsPanel.add(numbers[0]);
        buttonsPanel.add(dot);
        buttonsPanel.add(equ);

        panel.add(screen, BorderLayout.NORTH);
        panel.add(buttonsPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::new);
    }
}
