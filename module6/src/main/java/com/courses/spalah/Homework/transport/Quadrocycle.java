package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Quadrocycle extends Motorcycle {
    private String modelName;
    private boolean have4wheel = true;

    public Quadrocycle(String modelName, boolean have4wheel){
        this.modelName = modelName;
        this.have4wheel = have4wheel;
    }

    public String getQuadrocycleName(){
        return modelName;
    }

    public boolean getQuadrocycleProperty(){
        return have4wheel;
    }
}
