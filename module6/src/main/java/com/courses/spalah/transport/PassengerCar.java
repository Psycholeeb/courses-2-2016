package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class PassengerCar extends Car {
    private String model;
    private float clearance;

    public PassengerCar(String model, float engineVolume, float engineCapacity, float mileage, float clearance) {
        this.model = model;
        setEngineVolume(engineVolume);
        setEngineCapacity(engineCapacity);
        setMileage(mileage);
        this.clearance = clearance;
    }

    public String getModel() {
        return model;
    }

    public float getClearance() {
        return clearance;
    }
}
