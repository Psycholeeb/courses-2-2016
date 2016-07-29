package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Tricycle extends Motorcycle{
    private String model;

    public Tricycle(String model, float engineVolume) {
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public String getModel() {
        return model;
    }
}
