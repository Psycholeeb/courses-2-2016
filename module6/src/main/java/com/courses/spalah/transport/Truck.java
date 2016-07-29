package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Truck extends Car{
    private String model;
    private float volumeOfTruck;

    public Truck(String model, float maxSpeed, float volumeOfTruck) {
        this.model = model;
        setMaxSpeed(maxSpeed);
        this.volumeOfTruck = volumeOfTruck;
    }

    public String getModel() {
        return model;
    }

    public float getVolumeOfTruck() {
        return volumeOfTruck;
    }


}
