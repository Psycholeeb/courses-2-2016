package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Plane extends AirTransport{
    private String model;
    private int capacity;

    public Plane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
