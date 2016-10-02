package com.courses.spalah;

import javax.swing.*;
import java.awt.*;
import java.text.Normalizer;

/**
 * Created by Татьяна on 11.09.2016.
 */
public class ClientForm {
    private JTextField nameFld;
    private JTextField surnameFld;
    private JTextField addressFld;
    private JTextField nameFld2;
    private JTextField surnameFld2;
    private JTextField addressFld2;
    private JTextField IDFld;
    private JButton saveBtn;
    private JButton showBtn;
    private JPanel panel = new JPanel();
    private final static int DISTANCE_BETWEEN_COMPONENTS = 60;

    JPanel createPanel() {
        panel.setLayout(null);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameFld = addTextField();
        surnameFld = addTextField();
        addressFld = addTextField();
        setLocationForThreeTextFields(40, 40, 40, nameFld, surnameFld, addressFld);
        addComponentsToPanel(panel, nameFld, surnameFld, addressFld);

        saveBtn = addButton("Save");
        saveBtn.setLocation(nameFld.getX(), nameFld.getY() + DISTANCE_BETWEEN_COMPONENTS);
        showBtn = addButton("Show");
        showBtn.setLocation(saveBtn.getX(), saveBtn.getY() + DISTANCE_BETWEEN_COMPONENTS);
        addComponentsToPanel(panel, saveBtn, showBtn);

        IDFld = addTextField();
        IDFld.setSize(60, 30);
        IDFld.setLocation(showBtn.getX()+ showBtn.getWidth() + 20, showBtn.getY());
        panel.add(IDFld);

        nameFld2 = addTextField();
        surnameFld2 = addTextField();
        addressFld2 = addTextField();
        setLocationForThreeTextFields(showBtn.getX(), showBtn.getY() + DISTANCE_BETWEEN_COMPONENTS, 40, nameFld2, surnameFld2, addressFld2);
        addComponentsToPanel(panel, nameFld2, surnameFld2, addressFld2);
        return panel;
    }

    private JTextField addTextField() {
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

    private void setLocationForThreeTextFields(int xPosition, int yPosition, int distance, JTextField field1, JTextField field2, JTextField field3) {
        field1.setLocation(xPosition, yPosition);
        field2.setLocation(field1.getX() + field1.getWidth() + distance, yPosition);
        field3.setLocation(field2.getX() + field2.getWidth() + distance, yPosition);
    }

    private void addComponentsToPanel(JPanel panel, Component... components) {

        for (Component f : components) {
            panel.add(f);
        }
    }

    JTextField getNameFld() {
        return nameFld;
    }

    JTextField getSurnameFld() {
        return surnameFld;
    }

    JTextField getAddressFld() {
        return addressFld;
    }

    JTextField getNameFld2() {
        return nameFld2;
    }

    JTextField getSurnameFld2() {
        return surnameFld2;
    }

    JTextField getAddressFld2() {
        return addressFld2;
    }

    JTextField getIDFld() {
        return IDFld;
    }

    JButton getSaveBtn() {
        return saveBtn;
    }

    JButton getShowBtn() {
        return showBtn;
    }

}
