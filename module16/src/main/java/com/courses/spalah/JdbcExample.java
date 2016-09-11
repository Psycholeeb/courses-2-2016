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

        mainForm.getSaveBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    preparedStatementAddress.setString(1, mainForm.getAddressFld().getText());
                    preparedStatementAddress.executeUpdate();
                    Statement statement = con.createStatement();
                    String sql = "SELECT MAX(id) FROM address";
                    ResultSet result = statement.executeQuery(sql);
                    int addressID = 0;
                    while (result.next()) {
                         addressID = result.getInt("MAX(id)");
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
