package com.courses.spalah;

import javax.swing.*;

/**
 * Created by Татьяна on 30.09.2016.
 */
public class FormsCreator {
    private JFrame jFrame = new JFrame();
    private ClientForm clientForm = new ClientForm();
    private final static int FRAME_HEIGHT = 350;
    private final static int FRAME_WIDTH = 540;

    public ClientForm createForm() {
        jFrame.setContentPane(clientForm.createPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jFrame.setVisible(true);
        return clientForm;
    }
}
