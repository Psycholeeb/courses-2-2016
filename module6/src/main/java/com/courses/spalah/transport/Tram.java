package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Tram extends RailwayTransport {
    private int numberOfWagons;
    private int tramNumber;

    public Tram(int numberOfWagons, int tramNumber) {
        this.numberOfWagons = numberOfWagons;
        this.tramNumber = tramNumber;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public int getTramNumber() {
        return tramNumber;
    }
}
