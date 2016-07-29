package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Sportbike extends Motorcycle{
    private String modelName;
    private boolean speedOver9000 = true;

    public Sportbike(String modelName, boolean speedOver9000){
        this.modelName = modelName;
        this.speedOver9000 = speedOver9000;
    }

    public String getSportbikeName(){
        return modelName;
    }

    public boolean getSportbikeProperty(){
        return speedOver9000;
    }
}
