package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Car extends GasolineTransport {
    private float engineVolume;
    private float mileage;

    public float getEngineVolume() {
        return engineVolume;
    }

    public float getMileage() {
        return mileage;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }
}
