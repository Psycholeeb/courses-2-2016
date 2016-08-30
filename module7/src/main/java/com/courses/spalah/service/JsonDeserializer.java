package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;


/**
 * Created by Rita on 07.08.2016.
 */
public class JsonDeserializer {//implements CarParkingDeserializer {
   // @Override
    public CarParking deserialize(String serializedCarParking) {
        String [] deser = serializedCarParking
                .replaceAll("\\{", "")
                .replaceAll("\\}", "")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replaceAll(",", "")
                .replaceAll(":", "")
                .replaceAll(" ", "")
                .replaceAll("\n", "")
                .split("\"");
        CarParking carParking = new CarParking();
        int index = 0;
        Car car = new Car();
        Car [] cars = new Car [countCars(deser)];
        for(int i = 0; i < deser.length; i++) {
            if (deser[i].equals("address")) {
                carParking.setAddress(deser[i + 1]);
            }
            if (deser[i].equals("parkingName")) {
                carParking.setParkingName(deser[i + 1]);
            }
            if (deser[i].equals("manufacturer")) {
                car.setManufacturer(deser[i + 1]);
            }
            if (deser[i].equals("modelName")) {
                car.setModelName(deser[i + 1]);
            }
            if (deser[i].equals("vin")) {
            car.setVin(deser[i + 1]);
            }
            if (deser[i].equals("lengthMillimeters")) {
           car.setLengthMillimeters(Integer.valueOf(deser[i + 1]));
            }
            if (deser[i].equals("heightMillimeters")) {
           car.setHeightMillimeters(Integer.valueOf(deser[i + 1]));
           cars[index] = car;
           index++;
           }
        }
        carParking.setCars(cars);
        return carParking;

    }
    public int countCars(String [] deser) {
        int count = 0;
        for (String str: deser){
            if(deser.equals("manufacturer")){
                count++;
            }
        }
        return count;
    }
}


