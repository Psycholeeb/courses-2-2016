package com.courses.spalah;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Татьяна on 13.10.2016.
 */
public class UsersHttpServlet extends HttpServlet {
    @Override
    public void init() {
        try {
            registerDriver();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Person person;
        DatabaseManager databaseManager = new DatabaseManager();
        ConnectionManager connectionManager = new ConnectionManager();
        try {
            Connection connection = connectionManager.createConnection();
            int ID = Integer.parseInt(request.getParameter("userId"));
            person = databaseManager.showPerson(ID, connection);
            connection.close();
            String name = person.getName();
            String surname = person.getSurname();
            String address = person.getAddress();
            response.getWriter().write("<html><body>" + "<p>Name: " + name + "</p><p>Surname: " + surname + "</p><p>Address: " + address + "</p></body></html>");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    private static void registerDriver() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
    }
}
