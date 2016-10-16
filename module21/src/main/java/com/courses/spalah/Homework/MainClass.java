package com.courses.spalah.Homework;

import javax.swing.*;

/**
 * Created by Татьяна on 07.10.2016.
 */
public class MainClass {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow();
            }
        });
    }
}
