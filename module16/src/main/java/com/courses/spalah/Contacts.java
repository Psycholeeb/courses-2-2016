package com.courses.spalah;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class Contacts {
    public static Form contactsForm;
    static ConnectionManager connectionManager = new ConnectionManager("C:\\db.properties");

    public static void main(String[] args) throws SQLException, IOException {
        contactsForm = new Form();
    }
}
