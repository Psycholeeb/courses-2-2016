package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

/**
 * Created by Rita on 01.08.2016.
 */
public class JsonSerializer implements CarParkingSerializer {
    @Override
    public String serialize(CarParking carParking) {
    StringBuilder carpark = new StringBuilder();
        carpark.append("{\n")
                .append(" \"address\": \"")
                .append(carParking.getAddress()+ "\",\n")
                .append(" \"parkingName\": \"")
                .append(carParking.getParkingName()+ "\",\n")
                .append(" \"cars\": [\n");
        for (Car car: carParking.getCars()){
            carpark.append("{\n")
                    .append(" \"manufacturer\": \"")
                    .append(car.getManufacturer()+ "\",\n")
                    .append(" \"modelName\": \"")
                    .append(car.getModelName()+ "\",\n")
                    .append(" \"vin\": \"")
                    .append(car.getVin()+ "\",\n")
                    .append(" \"lengthMillimeters\": \"")
                    .append(car.getLengthMillimeters()+ "\",\n")
                    .append(" \"heightMillimeters\": \"")
                    .append(car.getHeightMillimeters()+ "\n")
                    .append("},\n");

        }
        carpark.deleteCharAt(carpark.length() - 2);
        carpark.append("]\n");
        carpark.append("}");
       // System.out.println(carpark);
        return carpark.toString();
    }
}
