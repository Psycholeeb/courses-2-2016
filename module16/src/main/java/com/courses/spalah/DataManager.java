package com.courses.spalah;

import java.io.IOException;
import java.sql.*;

import static com.courses.spalah.Form.label;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class DataManager {
    private final String INSERTTOADDRESS = "INSERT INTO address VALUE(id, ?)";
    private final String INSERTTOPERSON = "INSERT INTO person VALUE(id, ?, ?, ?)";
    private final String SELECTPERSON = "SELECT person.first_name, person.last_name, address.address FROM person\n" +
            "INNER JOIN address ON address_id = address.id WHERE person.id = ?";
    private final String FIRSTNAME = "first_name";
    private final String SURNAME = "last_name";
    private final String ADDRESS = "address";


    public int savePerson(Person person, Connection connection) throws IOException, SQLException {
        String name = person.getName();
        String surname = person.getSurname();
        String address = person.getAddress();
        PreparedStatement psPerson = connection.prepareStatement(INSERTTOPERSON, Statement.RETURN_GENERATED_KEYS);
        PreparedStatement psAddress = connection.prepareStatement(INSERTTOADDRESS, Statement.RETURN_GENERATED_KEYS);

        psAddress.setString(1, address);
        psAddress.executeUpdate();

        ResultSet generatedAddressKey = psAddress.getGeneratedKeys();
        generatedAddressKey.next();
        int id = generatedAddressKey.getInt(1);
        psPerson.setString(1, name);
        psPerson.setString(2, surname);
        psPerson.setInt(3, id);
        psPerson.executeUpdate();

        ResultSet generatedPersonKey = psPerson.getGeneratedKeys();
        generatedPersonKey.next();
        int personId = generatedPersonKey.getInt(1);

        psPerson.close();
        psAddress.close();
        return personId;
    }

    public Person readPerson(int id, Connection connection) throws IOException, SQLException {
        Person person = new Person(null, null, null);
        PreparedStatement psSelectperson = connection.prepareStatement(SELECTPERSON);
        psSelectperson.setInt(1, id);
        ResultSet result = psSelectperson.executeQuery();
        while (result.next()) {
            person.setName(result.getString(FIRSTNAME));
            person.setSurname(result.getString(SURNAME));
            person.setAddress(result.getString(ADDRESS));
        }
        psSelectperson.close();
        return person;
    }
}
