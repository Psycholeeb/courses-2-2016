package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Trolleybus extends GroundTransport {
    private int quantityOfPassengers;
    private boolean cityTransport = true;

    public Trolleybus(int quantityOfPassengers, boolean cityTransport){
        this.quantityOfPassengers = quantityOfPassengers;
        this.cityTransport = cityTransport;
    }

    public int getQuantityOfPassengers(){
        return quantityOfPassengers;
    }

    public boolean getTrolleybusProperty(){
        return cityTransport;
    }
}
