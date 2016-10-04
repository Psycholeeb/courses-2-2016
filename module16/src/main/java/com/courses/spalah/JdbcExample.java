package com.courses.spalah;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Ievgen Tararaka
 */
public class JdbcExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        FormsCreator formsCreator = new FormsCreator();
        ClientForm clientForm = formsCreator.createForm();
        DatabaseManager databaseManager = new DatabaseManager();
        registerDriver();
        ConnectionManager connectionManager = new ConnectionManager();
        Connection connection = connectionManager.createConnection();


        clientForm.getSaveBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String address = clientForm.getAddressFld().getText();
                String firstName = clientForm.getNameFld().getText();
                String lastName = clientForm.getSurnameFld().getText();
                Person person = new Person(firstName, lastName, address);
                if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        databaseManager.savePerson(person, connection);
                        JOptionPane.showMessageDialog(new JFrame(), "Saved", "Dialog", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        });

        clientForm.getShowBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(clientForm.getIDFld().getText());
                try {

                    Person person = databaseManager.showPerson(ID, connection);
                    clientForm.getNameFld2().setText(person.getName());
                    clientForm.getSurnameFld2().setText(person.getSurname());
                    clientForm.getAddressFld2().setText(person.getAddress());
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    /**
     * Для Java 6 и ниже необходимо зарегистрировать драйвер
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private static void registerDriver() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // или любой другой драйвер
        Class.forName("com.mysql.jdbc.Driver");
    }
}
