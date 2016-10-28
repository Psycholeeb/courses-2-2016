package com.courses.spalah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ievgen Tararaka
 */
public class JdbcExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        registerDriver();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "progmaker2", "179328"); // открытие соединения к базе
        Statement statement = con.createStatement();
        //ResultSet
        int rs = statement.executeUpdate("CREATE DATABASE IF NOT EXISTS People;.\n" +
                "\n" +
                "\n" +
                "CREATE TABLE if not exists People.address (\n" +
                "  id      INT PRIMARY KEY,\n" +
                "  address VARCHAR(255)\n" +
                ");\n" +
                "\n" +
                "drop table if exists People.person;\n" +
                "Create Table  IF NOT EXISTS People.person\n" +
                "(\n" +
                "id  int PRIMARY KEY,\n" +
                "first_name varchar(255),\n" +
                "last_name varchar(255),\n" +
                "address_id int/*,\n" +
                "FOREIGN KEY (id) REFERENCES address (People.id)*/\n" +
                ");# MySQL вернула пустой результат (т.е. ноль строк).\n" +
                "\n" +
                "insert into People.address (id, address) values (1,'Ap #999-6608 Felis, St.');\n" +
                "insert into People.address (id, address) values (2,'8403 In Road');\n" +
                "insert into People.address (id, address) values (3,'4895 Dolor. Road');\n" +
                "insert into People.address (id, address) values (4,'233-3092 Sem Av.');\n" +
                "insert into People.address (id, address) values (5,'Ap #258-8948 At, Rd.');\n" +
                "insert into People.address (id, address) values (6,'2911 Nec, Rd.');\n" +
                "insert into People.address (id, address) values (7,'7886 Proin St.');\n" +
                "insert into People.address (id, address) values (8,'Ap #314-418 Lorem Av.');\n" +
                "insert into People.address (id, address) values (9,'Ap #821-4665 Lorem, Rd.');\n" +
                "insert into People.address (id, address) values (10,'Ap #650-4921 Aptent Ave');\n" +
                "\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (1,'Vincent','Keith',1);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (2,'Fritz','Bray',2);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (3,'Lyle','Patterson',3);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (4,'Holmes','Hardy',4);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (5,'Cody','Larson',5);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (6,'Gary','Ellis',6);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (7,'Victor','Jensen',7);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (8,'Galvin','Freeman',8);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (9,'Jack','Foley',9);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (10,'Christian','Torres',10);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (11,'Peter','Haney',3);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (12,'Cameron','Barry',2);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (13,'Aladdin','Barnett',9);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (14,'Lionel','Soto',1);\n" +
                "insert into People.person (id, first_name, last_name, address_id) values (15,'Preston','Trujillo',1);\n"); //).executeQuery("SELECT * FROM test.person");
        System.out.println(rs);
        /*int columnCount = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(rs.getString(i));
            }
        }*/
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
