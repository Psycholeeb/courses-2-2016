package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class MotorcycleWithSidecar extends Motorcycle{
    private String modelName;
    private boolean haveSidecar = true;

    public MotorcycleWithSidecar(String modelName, boolean haveSidecar){
        this.modelName = modelName;
        this.haveSidecar = haveSidecar;
    }

    public String getMotorcycleWithSidecarName(){
        return modelName;
    }

    public boolean getMotorcycleWithSidecarProperty(){
        return haveSidecar;
    }
}


