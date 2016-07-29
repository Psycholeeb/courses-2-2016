package com.courses.spalah.Homework.transport;

/**
 * Created by Artem Uskov on 24.07.2016.
 */
public class Train extends MoveByRailsTransport {
    private int quantityOfVagons;
    private boolean intercityTransport = true;

    public Train(int quantityOfVagons, boolean intercityTransport){
        this.quantityOfVagons = quantityOfVagons;
        this.intercityTransport = intercityTransport;
    }

    public int getQuantityOfVagons(){
        return quantityOfVagons;
    }

    public boolean getTrainProperty(){
        return intercityTransport;
    }
}
