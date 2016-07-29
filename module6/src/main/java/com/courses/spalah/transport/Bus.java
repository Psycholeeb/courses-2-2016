package com.courses.spalah.transport;

/**
 * Created by Татьяна on 23.07.2016.
 */
public class Bus extends Car{
    private String model;
    private int numberOBus;
    private int capacityOfBus;

    public Bus(String model, int numberOBus, int capacityOfBus) {
        this.model = model;
        this.numberOBus = numberOBus;
        this.capacityOfBus = capacityOfBus;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOBus() {
        return numberOBus;
    }

    public int getCapacityOfBus() {
        return capacityOfBus;
    }


}
