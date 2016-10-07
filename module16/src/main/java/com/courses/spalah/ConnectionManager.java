package com.courses.spalah;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class ConnectionManager {
    private Connection connection;
    private String pathToProperties;
    private String url;
    private String username;
    private String password;

    public ConnectionManager(String path) {
        this.pathToProperties = path;
    }

    public Connection createConnection() throws SQLException, IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(pathToProperties);
        prop.load(input);
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
