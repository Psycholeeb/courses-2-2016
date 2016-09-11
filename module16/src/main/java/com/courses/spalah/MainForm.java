package com.courses.spalah;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by Татьяна on 11.09.2016.
 */
public class MainForm {
    private JTextField nameFld;
    private JTextField surnameFld;
    private JTextField addressFld;
    private JTextField nameFld2;
    private JTextField surnameFld2;
    private JTextField addressFld2;
    private JTextField IDFld;
    private JButton saveBtn;
    private JButton showBtn;

    JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        nameFld = addTextField("Name");
        nameFld.setLocation(40, 40);
        nameFld.addFocusListener(new Focus(nameFld));


        surnameFld = addTextField("Surname");
        surnameFld.setLocation(nameFld.getX() + nameFld.getWidth() + 40, 40);
        surnameFld.addFocusListener(new Focus(surnameFld));

        addressFld = addTextField("Address");
        addressFld.setLocation(surnameFld.getX() + surnameFld.getWidth() + 40, 40);
        addressFld.addFocusListener(new Focus(addressFld));
        panel.add(nameFld);
        panel.add(surnameFld);
        panel.add(addressFld);

        saveBtn = addButton("Save");
        saveBtn.setLocation(nameFld.getX(), nameFld.getY() + nameFld.getHeight() + 40);
        panel.add(saveBtn);
        showBtn = addButton("Show");
        showBtn.setLocation(saveBtn.getX(), saveBtn.getY() + saveBtn.getHeight() + 40);
        panel.add(showBtn);

        IDFld = addTextField("ID");
        IDFld.setSize(60, 30);
        IDFld.setLocation(showBtn.getX() + showBtn.getWidth() + 20, showBtn.getY());
        IDFld.addFocusListener(new Focus(IDFld));
        panel.add(IDFld);

        nameFld2 = addTextField("Name");
        nameFld2.setLocation(showBtn.getX(), showBtn.getY() + showBtn.getHeight() + 40);
        surnameFld2 = addTextField("Surname");
        surnameFld2.setLocation(nameFld2.getX() + nameFld2.getWidth() + 40, nameFld2.getY());
        addressFld2 = addTextField("Address");
        addressFld2.setLocation(surnameFld2.getX() + surnameFld2.getWidth() + 40, surnameFld2.getY());
        panel.add(nameFld2);
        panel.add(surnameFld2);
        panel.add(addressFld2);
        return panel;
    }

    private JTextField addTextField(String text) {
        JTextField textField = new JTextField();
        textField.setSize(120, 30);

        return textField;
    }

    private JButton addButton(String text) {
        JButton jButton = new JButton();
        jButton.setSize(80, 30);
        jButton.setText(text);
        return jButton;
    }

    public JTextField getNameFld() {
        return nameFld;
    }

    public JTextField getSurnameFld() {
        return surnameFld;
    }

    public JTextField getAddressFld() {
        return addressFld;
    }

    public JTextField getNameFld2() {
        return nameFld2;
    }

    public JTextField getSurnameFld2() {
        return surnameFld2;
    }

    public JTextField getAddressFld2() {
        return addressFld2;
    }

    public JTextField getIDFld() {
        return IDFld;
    }

    public JButton getSaveBtn() {
        return saveBtn;
    }

    public JButton getShowBtn() {
        return showBtn;
    }

    private class Focus implements FocusListener {
        private JTextField field;

        Focus(JTextField field) {
            this.field = field;
        }

        @Override
        public void focusGained(FocusEvent e) {
            field.setText("");
        }

        @Override
        public void focusLost(FocusEvent e) {
        }
    }
}
