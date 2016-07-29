package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Helicopter extends AirTransport {
    private String model;
    private float lengthOfBlade;

    public Helicopter(String model, float lengthOfBlade) {
        this.model = model;
        this.lengthOfBlade = lengthOfBlade;
    }

    public String getModel() {
        return model;
    }

    public float getLengthOfBlade() {

        return lengthOfBlade;
    }

}
