package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Tram extends MoveByRailsTransport {
    private int quantityOfPassengers;
    private boolean cityTransport = true;

    public Tram(int quantityOfPassengers, boolean cityTransport){
        this.cityTransport = cityTransport;
        this.quantityOfPassengers = quantityOfPassengers;
    }

    public int getQuantityOfPassengers(){
        return quantityOfPassengers;
    }

    public boolean getTramProperty(){
        return cityTransport;
    }
}
