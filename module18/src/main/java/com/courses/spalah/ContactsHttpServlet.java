package com.courses.spalah;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Created by Artem Uskov on 29.09.2016.
 */
public class ContactsHttpServlet extends HttpServlet {

    private final String WRONGREQUEST = "<html><body>Wrong request</body></html>";

    private static void registerDriver() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
    }

    @Override
    public void init() {
        try {
            registerDriver();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Person person = new Person(null, null, null);
        DataManager data = new DataManager();
        try {
            int param1 = Integer.parseInt(request.getParameter("userId"));
            ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");
            Connection connection = connectionManager.createConnection();
            person = data.readPerson(param1, connection);
            connection.close();
            String name = person.getName();
            String surname = person.getSurname();
            String address = person.getAddress();
            response.getWriter().write("<html><body>" + name + " " + surname + " " + address + "</body></html>");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write(WRONGREQUEST);
        } catch (NumberFormatException fex) {
            fex.printStackTrace();
            response.getWriter().write(WRONGREQUEST);
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = null;
        String surname = null;
        String address = null;
        Person person = new Person(null, null, null);
        String requestBody = null;
        try {
            BufferedReader reader = request.getReader();
            requestBody = reader.readLine();
        } catch (Exception e) {
            response.getWriter().write(WRONGREQUEST);
        }
        String[] params = requestBody.split("&");

        for(String s : params) {
            if(s.startsWith("name")) {
                int index = s.indexOf("=");
                name = s.substring(index + 1);
                person.setName(name);
            }
            if(s.startsWith("surname")) {
                int index = s.indexOf("=");
                surname = s.substring(index + 1);
                person.setSurname(surname);
            }
            if(s.startsWith("address")) {
                int index = s.indexOf("=");
                address = s.substring(index + 1);
                person.setAddress(address);
            }
        }

        int userId;
        DataManager data = new DataManager();
        ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");
        try {
            Connection connection = connectionManager.createConnection();
            userId = data.savePerson(person, connection);
            connection.close();
            final String SETUSERRESPONSE = "<html><body>User " + name + " " + surname + " " + address + " saved with id " + userId + "</body></html>";
            response.getWriter().write(SETUSERRESPONSE);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write(WRONGREQUEST);
        }
    }
}
