package com.courses.spalah;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @author Ievgen Tararaka
 */
public class JdbcExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame jFrame = new JFrame("");
        MainForm mainForm = new MainForm();
        jFrame.setContentPane(mainForm.createPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(540, 350);
        jFrame.setVisible(true);

        registerDriver();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/people", "root", "root");

        String insertToAddress = "INSERT INTO address VALUE(id, ?)";
        PreparedStatement preparedStatementAddress = con.prepareStatement(insertToAddress);

        String insertToPerson = "INSERT INTO person VALUE(id, ?, ?, ?)";
        PreparedStatement preparedStatementPerson = con.prepareStatement(insertToPerson);

        String selectCount = "SELECT COUNT(id) FROM address WHERE address.address = ?";
        PreparedStatement preparedStatementSelectCount = con.prepareStatement(selectCount);

        String selectID = "SELECT id FROM address WHERE address.address = ?";
        PreparedStatement preparedStatementSelectID = con.prepareStatement(selectID);

        String selectPerson = "SELECT person.first_name, person.last_name, address.address FROM person\n" +
                "INNER JOIN address ON address_id = address.id WHERE person.id = ?";
        PreparedStatement preparedStatementSelectPerson = con.prepareStatement(selectPerson);
        mainForm.getSaveBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String address = mainForm.getAddressFld().getText();
                    preparedStatementSelectCount.setString(1, address);
                    ResultSet res = preparedStatementSelectCount.executeQuery();
                    int count = 0;
                    while (res.next()) {
                        count = res.getInt("COUNT(id)");
                    }
                    if (count == 0) {
                        preparedStatementAddress.setString(1, address);
                        preparedStatementAddress.executeUpdate();
                    }
                    preparedStatementSelectID.setString(1, address);
                    ResultSet result = preparedStatementSelectID.executeQuery();
                    int addressID = 0;
                    while (result.next()) {
                        addressID = result.getInt("id");
                    }
                    preparedStatementPerson.setString(1, mainForm.getNameFld().getText());
                    preparedStatementPerson.setString(2, mainForm.getSurnameFld().getText());
                    preparedStatementPerson.setInt(3, addressID);
                    preparedStatementPerson.executeUpdate();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                JOptionPane.showMessageDialog(new JFrame(), "Saved", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        mainForm.getShowBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(mainForm.getIDFld().getText());
                try {
                    preparedStatementSelectPerson.setInt(1, ID);
                    ResultSet result = preparedStatementSelectPerson.executeQuery();
                    while (result.next()) {
                        String firstName = result.getString("first_name");
                        mainForm.getNameFld2().setText(firstName);
                        String lastName = result.getString("last_name");
                        mainForm.getSurnameFld2().setText(lastName);
                        String address = result.getString("address");
                        mainForm.getAddressFld2().setText(address);
                    }

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
