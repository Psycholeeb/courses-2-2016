package com.courses.spalah.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Татьяна on 05.10.2016.
 */
public class MainWindow extends JFrame {
    private static final Dimension FRAME_SIZE = new Dimension(900, 600);

    MainWindow() {
        this.setSize(FRAME_SIZE);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        BallsPanel ballsPanel = new BallsPanel();
        this.setContentPane(ballsPanel);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballsPanel.repaint();
            }
        });
        timer.start();
    }
}
