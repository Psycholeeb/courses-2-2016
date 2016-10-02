package com.courses.spalah;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Татьяна on 30.09.2016.
 */
public class ConnectionManager {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public Connection createConnection() throws IOException, SQLException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("module16/src/main/resources/config.properties");
        properties.load(fileInputStream);

        url = properties.getProperty("db.host");
        username = properties.getProperty("db.login");
        password = properties.getProperty("db.password");
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
