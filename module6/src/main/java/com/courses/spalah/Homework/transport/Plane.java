package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Plane extends AirTransport {
    private String modelName;
    private boolean longDistanceFly = true;

    public Plane(String modelName, boolean longDistanceFly){
        this.modelName = modelName;
        this.longDistanceFly = longDistanceFly;
    }

    public String getPlaneName(){
        return modelName;
    }

    public boolean getPlaneProperty(){
        return longDistanceFly;
    }

}


