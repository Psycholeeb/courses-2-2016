package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Trolleybus extends ElectricTransport {
    private int trolleybusNumber;

    public Trolleybus(int trolleybusNumber) {
        this.trolleybusNumber = trolleybusNumber;
    }

    public int getTrolleybusNumber() {
        return trolleybusNumber;
    }
}