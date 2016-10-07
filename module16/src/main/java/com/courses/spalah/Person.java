package com.courses.spalah;

/**
 * Created by Artem Uskov on 27.09.2016.
 */
public class Person {

    private String name;
    private String surname;
    private String address;

    public Person(String n, String s, String a) {
        this.name = n;
        this.surname = s;
        this.address = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSurname(String s) {
        surname = s;
    }

    public void setAddress(String adr) {
        address = adr;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
