package com.courses.spalah;

import java.sql.*;

/**
 * Created by Татьяна on 30.09.2016.
 */
public class DatabaseManager {
    private final static String INSERT_TO_ADDRESS = "INSERT INTO address VALUE(id, ?)";
    private final static String INSERT_TO_PERSON = "INSERT INTO person VALUE(id, ?, ?, ?)";
    private final static String SELECT_COUNT = "SELECT COUNT(id) FROM address WHERE address.address = ?";
    private final static String SELECT_ID = "SELECT id FROM address WHERE address.address = ?";
    private final static String SELECT_PERSON = "SELECT person.first_name, person.last_name, address.address FROM person\n" +
            "INNER JOIN address ON address_id = address.id WHERE person.id = ?";
    private final static String NAME_COLUMN = "first_name";
    private final static String SURNAME_COLUMN = "last_name";
    private final static String ADDRESS_COLUMN = "address";


    public int savePerson(Person person, Connection connection) throws SQLException {
        String name = person.getName();
        String surname = person.getSurname();
        String address = person.getAddress();

        PreparedStatement psSelectCount = connection.prepareStatement(SELECT_COUNT);
        PreparedStatement psAddress = connection.prepareStatement(INSERT_TO_ADDRESS);
        PreparedStatement psSelectID = connection.prepareStatement(SELECT_ID);
        PreparedStatement psPerson = connection.prepareStatement(INSERT_TO_PERSON, Statement.RETURN_GENERATED_KEYS);

        psSelectCount.setString(1, address);
        ResultSet res = psSelectCount.executeQuery();
        res.next();
        int count = res.getInt("COUNT(id)");

        if (count == 0) {
            psAddress.setString(1, address);
            psAddress.executeUpdate();
        }

        psSelectID.setString(1, address);
        ResultSet result = psSelectID.executeQuery();
        result.next();
        int addressID = result.getInt("id");

        psPerson.setString(1, name);
        psPerson.setString(2, surname);
        psPerson.setInt(3, addressID);
        psPerson.executeUpdate();

        ResultSet generatedPersonKey = psPerson.getGeneratedKeys();
        generatedPersonKey.next();
        int personId = generatedPersonKey.getInt(1);
        psSelectCount.close();
        psAddress.close();
        psSelectID.close();
        psPerson.close();
        return personId;
    }

    public Person showPerson(int id, Connection connection) throws SQLException {
        Person person = new Person();
        PreparedStatement psSelectPerson = connection.prepareStatement(SELECT_PERSON);
        psSelectPerson.setInt(1, id);
        ResultSet result = psSelectPerson.executeQuery();
        while (result.next()) {
            String name = result.getString(NAME_COLUMN);
            person.setName(name);

            String surname = result.getString(SURNAME_COLUMN);
            person.setSurname(surname);

            String address = result.getString(ADDRESS_COLUMN);
            person.setAddress(address);
        }
        psSelectPerson.close();
        return person;
    }
}