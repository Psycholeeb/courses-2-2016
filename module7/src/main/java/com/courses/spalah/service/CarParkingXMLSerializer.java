package com.courses.spalah.service;

import com.courses.spalah.model.CarParking;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingXMLSerializer implements CarParkingSerializer {

    @Override
    public String serialize(CarParking carParking) {

        return carParking.toString();
    }
}
