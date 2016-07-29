package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Helicopter extends AirTransport {
    private String modelName;
    private boolean shortDistanceFly = true;

    public Helicopter(String modelName, boolean shortDistanceFly){
        this.modelName = modelName;
        this.shortDistanceFly = shortDistanceFly;
    }

    public String getHelicopterName() {
        return modelName;
    }

    public boolean getHelicopterproperty(){
        return shortDistanceFly;
    }
}
