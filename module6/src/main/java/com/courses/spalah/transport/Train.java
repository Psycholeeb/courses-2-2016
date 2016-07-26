package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Train extends RailwayTransport {
    private int numberOfWagons;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }
}
