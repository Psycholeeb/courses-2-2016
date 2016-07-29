package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Car extends GroundTransport {
    private String modelName;
    private float engineVolume;

    public Car (String modelName, float engineVolume){
        this.modelName = modelName;
        this.engineVolume = engineVolume;
    }

    public String getCarName (){
        return modelName;
    }

    public float getEngineVolume (){
        return engineVolume;
    }
}
